package defpackage;

import android.content.res.AssetFileDescriptor;
import android.util.Base64OutputStream;
import android.util.Pair;
import io.sentry.q0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import okio.Okio;
import okio.RealBufferedSink;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mr5 implements Callable {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;

    public /* synthetic */ mr5(int i, Object obj) {
        this.E = i;
        this.F = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws IOException {
        String string;
        int i = this.E;
        boolean z = false;
        Object obj = this.F;
        switch (i) {
            case 0:
                or5 or5Var = (or5) obj;
                synchronized (or5Var) {
                    try {
                        efe efeVar = (efe) or5Var.a.get();
                        ArrayList arrayListR = efeVar.r();
                        efeVar.o();
                        JSONArray jSONArray = new JSONArray();
                        for (int i2 = 0; i2 < arrayListR.size(); i2++) {
                            q81 q81Var = (q81) arrayListR.get(i2);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("agent", q81Var.a);
                            jSONObject.put("dates", new JSONArray((Collection) q81Var.b));
                            jSONArray.put(jSONObject);
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("heartbeats", jSONArray);
                        jSONObject2.put("version", "2");
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                        try {
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                            try {
                                gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                                gZIPOutputStream.close();
                                base64OutputStream.close();
                                string = byteArrayOutputStream.toString("UTF-8");
                            } finally {
                                try {
                                    break;
                                } catch (Throwable th) {
                                }
                            }
                        } finally {
                            try {
                                break;
                            } catch (Throwable th2) {
                            }
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return string;
            case 1:
                return new oe9((JsReplyProxyBoundaryInterface) obj);
            case 2:
                vie vieVar = (vie) obj;
                jji jjiVar = vieVar.F;
                RealBufferedSink realBufferedSinkB = Okio.b(jjiVar);
                vieVar.E.writeTo(realBufferedSinkB);
                realBufferedSinkB.flush();
                if (jjiVar.F.getAndSet(true)) {
                    sz6.j("Already closed");
                } else {
                    try {
                        ((exf) ((Pair) jjiVar.E.take()).second).l(iji.F);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        xh6.c("Interrupted while waiting for a read to finish!");
                    }
                }
                return null;
            case 3:
                return (AssetFileDescriptor) obj;
            default:
                q0 q0Var = (q0) obj;
                try {
                    q0Var.e.getClass();
                    q0Var.b = InetAddress.getLocalHost().getCanonicalHostName();
                    q0Var.c = System.currentTimeMillis() + q0Var.a;
                    return null;
                } finally {
                    q0Var.d.set(false);
                }
        }
    }
}
