package siftscience.android;

import android.util.Base64;
import android.util.Log;
import com.google.gson.JsonIOException;
import com.sift.api.representations.ListRequestJson;
import com.sift.api.representations.MobileEventJson;
import defpackage.xd8;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPOutputStream;
import siftscience.android.Sift;

/* JADX INFO: loaded from: classes.dex */
public class Uploader {
    private static final long BACKOFF_EXPONENT = 2;
    private static final int MAX_BYTES = 4096;
    static final int MAX_RETRIES = 3;
    private static final String TAG = "siftscience.android.Uploader";
    private final ConfigProvider configProvider;
    private final TaskManager taskManager;
    private static final long BACKOFF_MULTIPLIER = 3;
    private static final TimeUnit BACKOFF_UNIT = TimeUnit.SECONDS;
    private static final Charset US_ASCII = StandardCharsets.US_ASCII;
    private static final Charset UTF8 = StandardCharsets.UTF_8;

    public interface ConfigProvider {
        Sift.Config getConfig();
    }

    public static class Request {
        private byte[] body;
        private Map<String, String> headers;
        private String method;
        private URL url;

        public static class Builder {
            private byte[] body;
            private Map<String, String> headers;
            private String method;
            private URL url;

            public Request build() {
                return new Request(this.method, this.url, this.headers, this.body);
            }

            public Builder withBody(byte[] bArr) {
                this.body = bArr;
                return this;
            }

            public Builder withHeaders(Map map) {
                this.headers = map;
                return this;
            }

            public Builder withMethod(String str) {
                this.method = str;
                return this;
            }

            public Builder withUrl(URL url) {
                this.url = url;
                return this;
            }
        }

        public Request(String str, URL url, Map map, byte[] bArr) {
            this.method = str;
            this.url = url;
            this.headers = map;
            this.body = bArr;
        }
    }

    public class UploadTask implements Runnable {
        private final Request request;
        private int retriesRemaining;
        private Uploader uploader;

        public UploadTask(Uploader uploader, Request request, int i) {
            this.uploader = uploader;
            this.request = request;
            this.retriesRemaining = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            String inputStreamAsString;
            String unused = Uploader.TAG;
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) this.request.url.openConnection();
                httpURLConnection.setRequestMethod(this.request.method);
                for (Map.Entry entry : this.request.headers.entrySet()) {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                httpURLConnection.setFixedLengthStreamingMode(this.request.body.length);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                httpURLConnection.connect();
                try {
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    try {
                        outputStream.write(this.request.body);
                        outputStream.close();
                        int responseCode = httpURLConnection.getResponseCode();
                        InputStream errorStream = responseCode >= 400 ? httpURLConnection.getErrorStream() : httpURLConnection.getInputStream();
                        if (errorStream != null) {
                            try {
                                inputStreamAsString = Uploader.this.readInputStreamAsString(errorStream, 4096);
                                errorStream.close();
                            } catch (Throwable th) {
                                errorStream.close();
                                throw th;
                            }
                        } else {
                            inputStreamAsString = null;
                        }
                        if (responseCode == 200) {
                            String unused2 = Uploader.TAG;
                        } else if (responseCode == 400) {
                            String unused3 = Uploader.TAG;
                            String.format("HTTP error: status=%d response=%s", Integer.valueOf(responseCode), inputStreamAsString);
                        } else {
                            String unused4 = Uploader.TAG;
                            String.format("HTTP error: status=%d response=%s", Integer.valueOf(responseCode), inputStreamAsString);
                            this.uploader.doUpload(this.request, this.retriesRemaining - 1);
                        }
                        httpURLConnection.disconnect();
                    } catch (Throwable th2) {
                        outputStream.close();
                        throw th2;
                    }
                } finally {
                    httpURLConnection.disconnect();
                }
            } catch (IOException e) {
                Log.e(Uploader.TAG, "Network error in UploadTask", e);
            }
        }
    }

    public Uploader(TaskManager taskManager, ConfigProvider configProvider) {
        this.taskManager = taskManager;
        this.configProvider = configProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doUpload(Request request, int i) {
        if (i == 0) {
            return;
        }
        this.taskManager.schedule(new UploadTask(this, request, i), (long) (Math.pow(3 - i, 2.0d) * BACKOFF_MULTIPLIER), BACKOFF_UNIT);
    }

    private Request makeRequest(List<MobileEventJson> list) throws IOException {
        Sift.Config config;
        if (list == null || list.isEmpty() || (config = this.configProvider.getConfig()) == null || !config.isValid()) {
            return null;
        }
        URL url = new URL(String.format(config.serverUrlFormat, config.accountId));
        String strEncodeToString = Base64.encodeToString(config.beaconKey.getBytes(US_ASCII), 2);
        HashMap map = new HashMap();
        map.put("Authorization", "Basic " + strEncodeToString);
        map.put("Accept", "application/json");
        map.put("Content-Encoding", "gzip");
        map.put("Content-Type", "application/json");
        ListRequestJson listRequestJsonWithData = new ListRequestJson().withData(Collections.unmodifiableList(list));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new GZIPOutputStream(byteArrayOutputStream), UTF8);
        xd8 xd8Var = Sift.GSON;
        if (listRequestJsonWithData != null) {
            Class<?> cls = listRequestJsonWithData.getClass();
            xd8Var.getClass();
            try {
                xd8Var.g(listRequestJsonWithData, cls, xd8Var.d(outputStreamWriter));
            } catch (IOException e) {
                throw new JsonIOException(e);
            }
        } else {
            xd8Var.getClass();
            try {
                xd8Var.f(xd8Var.d(outputStreamWriter));
            } catch (IOException e2) {
                throw new JsonIOException(e2);
            }
        }
        outputStreamWriter.close();
        String.format("Built HTTP request for batch of size %d", Integer.valueOf(list.size()));
        return new Request.Builder().withMethod("PUT").withUrl(url).withHeaders(map).withBody(byteArrayOutputStream.toByteArray()).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String readInputStreamAsString(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, 0, i - i2);
            if (i3 < 0) {
                break;
            }
            i2 += i3;
        }
        return new String(bArr, 0, i2, UTF8);
    }

    public void upload(List<MobileEventJson> list) {
        try {
            Request requestMakeRequest = makeRequest(list);
            if (requestMakeRequest != null) {
                String.format("Uploading batch of size %d", Integer.valueOf(list.size()));
                doUpload(requestMakeRequest, 3);
            }
        } catch (IOException e) {
            Log.e(TAG, "Encountered IOException in upload", e);
        }
    }
}
