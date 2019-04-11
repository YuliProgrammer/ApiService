package com.dolnikova;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

public class HttpUtil {

    public static String sendRequest(@NotNull String url, @Nullable Map<String, String> headers, @Nullable String body) {

        String result = null;
        HttpURLConnection urlConnection = null;

        try {
            URL requestUrl = new URL(url);
            urlConnection = (HttpURLConnection) requestUrl.openConnection();

            urlConnection.setConnectTimeout(40000);
            urlConnection.setReadTimeout(40000);

            urlConnection.setRequestMethod("GET");

            if (body != null && body.length() > 0) {
                urlConnection.setDoOutput(true);
                urlConnection.setRequestMethod("POST");
                DataOutputStream outputStream = new DataOutputStream(urlConnection.getOutputStream());
                outputStream.writeBytes(body);
                outputStream.flush();
                outputStream.close();
            }

            if (headers != null) {
                for (Map.Entry<String, String> entry : headers.entrySet()) {
                    urlConnection.addRequestProperty(entry.getKey(), entry.getValue());
                }
            }

            int status = urlConnection.getResponseCode();

            if (status == HttpURLConnection.HTTP_OK) {
                result = getStringFromStream(urlConnection.getInputStream());
            } else if (status == HttpURLConnection.HTTP_CREATED) {
                System.out.println("Your post has been successfully created.");
            }

        } catch (Exception e) {
            System.out.println("sendRequest failed" + e);

        } finally {
            if (urlConnection != null) {
                urlConnection.disconnect();
            }
        }

        return result;
    }

    public static void updateUrl(@NotNull String url, @Nullable Map<String, String> headers, @Nullable String body) {

        try {
            URL requestUrl = new URL(url);
            HttpURLConnection urlConnection = (HttpURLConnection) requestUrl.openConnection();
            urlConnection.setDoOutput(true);
            urlConnection.setRequestMethod("PUT");
            OutputStreamWriter out = new OutputStreamWriter(urlConnection.getOutputStream());
            out.write(body);
            out.close();
            urlConnection.getInputStream();

            int status = urlConnection.getResponseCode();

            if (status == HttpURLConnection.HTTP_OK) {
                System.out.println("Your post has been successfully updated.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void deleteUrl(@NotNull String url, @Nullable Map<String, String> headers, @Nullable String body) {

        try {
            URL requestUrl = new URL(url);
            HttpURLConnection urlConnection = (HttpURLConnection) requestUrl.openConnection();
            urlConnection.setDoOutput(true);
            urlConnection.setRequestMethod("DELETE");
            urlConnection.connect();
            urlConnection.getInputStream ();

            int status = urlConnection.getResponseCode();

            if (status == HttpURLConnection.HTTP_OK) {
                System.out.println("Your post has been successfully deleted.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static String getStringFromStream(InputStream inputStream) throws IOException {
        final int BUFFER_SIZE = 4096;
        ByteArrayOutputStream resultStream = new ByteArrayOutputStream(BUFFER_SIZE);
        byte[] buffer = new byte[BUFFER_SIZE];
        int length;
        while ((length = inputStream.read(buffer)) != -1) {
            resultStream.write(buffer, 0, length);
        }
        return resultStream.toString("UTF-8");
    }
}
