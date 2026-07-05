package defpackage;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.view.Surface;
import android.webkit.WebView;
import anthropic.claude.usercontent.sandbox.wire_format.Response;
import coil.request.NullRequestDataException;
import com.anthropic.claude.core.telemetry.SilentException;
import com.google.android.gms.location.LocationRequest;
import com.squareup.moshi.JsonDataException;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
public final class dke implements j4f, d6b, qff, zdc, iwj, see, tok {
    public Object E;
    public Object F;

    public dke(IBinder iBinder) throws RemoteException {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.E = new Messenger(iBinder);
            this.F = null;
        } else {
            if (!Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
                Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
                throw new RemoteException();
            }
            this.F = new p3k(iBinder);
            this.E = null;
        }
    }

    public static fu6 A(kx8 kx8Var, Throwable th) {
        if (th instanceof NullRequestDataException) {
            kx8Var.getClass();
            ct5 ct5Var = kx8Var.z;
            ct5Var.getClass();
            ct5 ct5Var2 = k.a;
            ct5Var.getClass();
        } else {
            kx8Var.z.getClass();
            ct5 ct5Var3 = k.a;
        }
        return new fu6(null, kx8Var, th);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.rjc B(defpackage.kx8 r15, defpackage.i8g r16) {
        /*
            r14 = this;
            r3 = r16
            java.util.List r1 = r15.f
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L14
            android.graphics.Bitmap$Config[] r1 = defpackage.l.a
            android.graphics.Bitmap$Config r2 = r15.d
            boolean r1 = defpackage.mp0.o0(r2, r1)
            if (r1 == 0) goto L2c
        L14:
            android.graphics.Bitmap$Config r1 = r15.d
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.HARDWARE
            if (r1 != r2) goto L30
            if (r1 != r2) goto L21
            boolean r1 = r15.k
            if (r1 != 0) goto L21
            goto L2c
        L21:
            java.lang.Object r1 = r14.F
            nf8 r1 = (defpackage.nf8) r1
            boolean r1 = r1.c(r3)
            if (r1 == 0) goto L2c
            goto L30
        L2c:
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888
        L2e:
            r2 = r1
            goto L33
        L30:
            android.graphics.Bitmap$Config r1 = r15.d
            goto L2e
        L33:
            java.lang.Object r14 = r14.E
            f1h r14 = (defpackage.f1h) r14
            boolean r14 = r14.H
            if (r14 == 0) goto L3f
            f52 r14 = r15.p
        L3d:
            r13 = r14
            goto L42
        L3f:
            f52 r14 = defpackage.f52.DISABLED
            goto L3d
        L42:
            kud r14 = r3.a
            t46 r1 = defpackage.t46.M
            boolean r14 = r14.equals(r1)
            if (r14 != 0) goto L59
            kud r14 = r3.b
            boolean r14 = r14.equals(r1)
            if (r14 == 0) goto L55
            goto L59
        L55:
            j6f r14 = r15.w
        L57:
            r4 = r14
            goto L5c
        L59:
            j6f r14 = defpackage.j6f.F
            goto L57
        L5c:
            boolean r14 = r15.l
            if (r14 == 0) goto L6f
            java.util.List r14 = r15.f
            boolean r14 = r14.isEmpty()
            if (r14 == 0) goto L6f
            android.graphics.Bitmap$Config r14 = android.graphics.Bitmap.Config.ALPHA_8
            if (r2 == r14) goto L6f
            r14 = 1
        L6d:
            r6 = r14
            goto L71
        L6f:
            r14 = 0
            goto L6d
        L71:
            rjc r14 = new rjc
            android.content.Context r1 = r15.a
            boolean r5 = defpackage.k.a(r15)
            boolean r7 = r15.m
            wg8 r8 = r15.h
            h4h r9 = r15.i
            asc r10 = r15.x
            f52 r11 = r15.n
            f52 r12 = r15.o
            r0 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dke.B(kx8, i8g):rjc");
    }

    public int C(lte lteVar) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.F;
        linkedHashMap.getClass();
        String strConcat = lteVar.a;
        if (strConcat == null) {
            String string = UUID.randomUUID().toString();
            string.getClass();
            linkedHashMap.put(string, lteVar);
            strConcat = "format:".concat(string);
        }
        return ((xb0) this.E).l(lte.b, strConcat);
    }

    public void D(Object obj) {
        ThreadLocal threadLocal = (ThreadLocal) this.E;
        ArrayDeque arrayDeque = (ArrayDeque) ((SoftReference) threadLocal.get()).get();
        if (arrayDeque == null) {
            arrayDeque = new ArrayDeque();
            threadLocal.set(new SoftReference(arrayDeque));
        }
        if (arrayDeque.size() < 12) {
            arrayDeque.push(obj);
        }
    }

    public void E(yui yuiVar) {
        Handler handler = (Handler) this.E;
        if (handler != null) {
            handler.post(new tui(this, 0, yuiVar));
        }
    }

    @Override // defpackage.d6b
    public void a() {
        xv8 xv8Var = (xv8) this.F;
        MediaCodec mediaCodec = (MediaCodec) this.E;
        try {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30 && i < 33) {
                mediaCodec.stop();
            }
            if (i >= 35 && xv8Var != null) {
                xv8Var.z(mediaCodec);
            }
            mediaCodec.release();
        } catch (Throwable th) {
            if (Build.VERSION.SDK_INT >= 35 && xv8Var != null) {
                xv8Var.z(mediaCodec);
            }
            mediaCodec.release();
            throw th;
        }
    }

    @Override // defpackage.see
    public /* synthetic */ void accept(Object obj, Object obj2) {
        ((v6k) obj).E((m11) this.E, (LocationRequest) this.F, (j5h) obj2);
    }

    @Override // defpackage.d6b
    public void b(Bundle bundle) {
        ((MediaCodec) this.E).setParameters(bundle);
    }

    @Override // defpackage.d6b
    public void c(int i, rc5 rc5Var, long j, int i2) {
        ((MediaCodec) this.E).queueSecureInputBuffer(i, 0, rc5Var.i, j, i2);
    }

    @Override // defpackage.d6b
    public void d(int i, int i2, int i3, long j) {
        ((MediaCodec) this.E).queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // defpackage.d6b
    public void e(int i) {
        ((MediaCodec) this.E).releaseOutputBuffer(i, false);
    }

    @Override // defpackage.d6b
    public MediaFormat f() {
        return ((MediaCodec) this.E).getOutputFormat();
    }

    @Override // defpackage.d6b
    public void flush() {
        ((MediaCodec) this.E).flush();
    }

    @Override // defpackage.d6b
    public void g() {
        ((MediaCodec) this.E).detachOutputSurface();
    }

    @Override // defpackage.j4f
    public String getName() {
        return "rpcResponse";
    }

    @Override // defpackage.d6b
    public void h(int i, long j) {
        ((MediaCodec) this.E).releaseOutputBuffer(i, j);
    }

    @Override // defpackage.d6b
    public int i() {
        return ((MediaCodec) this.E).dequeueInputBuffer(0L);
    }

    @Override // defpackage.iwj
    public c61 j(lsj lsjVar) {
        c61 c61Var = (c61) this.E;
        c61Var.Q((String) this.F, lsjVar);
        return c61Var;
    }

    @Override // defpackage.qff
    public int k(int i) {
        CharSequence charSequence = (CharSequence) this.E;
        do {
            i = ((bi0) this.F).A(i);
            if (i == -1 || i == charSequence.length()) {
                return -1;
            }
        } while (Character.isWhitespace(charSequence.charAt(i)));
        return i;
    }

    @Override // defpackage.qff
    public int l(int i) {
        do {
            i = ((bi0) this.F).N(i);
            if (i == -1 || i == 0) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.E).charAt(i - 1)));
        return i;
    }

    @Override // defpackage.d6b
    public int m(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = ((MediaCodec) this.E).dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // defpackage.d6b
    public void o(int i) {
        ((MediaCodec) this.E).setVideoScalingMode(i);
    }

    @Override // defpackage.i7j
    public void o0(WebView webView, ep1 ep1Var, Uri uri, boolean z, oe9 oe9Var) {
        Response response;
        t4f t4fVar = (t4f) this.F;
        webView.getClass();
        uri.getClass();
        oe9Var.getClass();
        if (z) {
            try {
                String strB = ep1Var.b();
                if (strB == null || (response = (Response) t4fVar.G.a(Response.class).fromJson(strB)) == null) {
                    return;
                }
                v84 v84Var = (v84) t4fVar.P.get(response.getRequest_id());
                if (v84Var != null) {
                    v84Var.c0(response);
                }
                n4f clientRpcListener = t4fVar.getClientRpcListener();
                if (clientRpcListener != null) {
                    clientRpcListener.I(response);
                }
                vtk.g(response.getPayload());
            } catch (JsonDataException e) {
                SilentException.a(new SilentException("SandboxWebView: Error handling response", e), null, false, 3);
            }
        }
    }

    @Override // defpackage.zdc
    public void onComplete(d5h d5hVar) {
        ((Map) ((cbf) this.F).G).remove((j5h) this.E);
    }

    @Override // defpackage.qff
    public int p(int i) {
        do {
            i = ((bi0) this.F).N(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.E).charAt(i)));
        return i;
    }

    @Override // defpackage.qff
    public int q(int i) {
        do {
            i = ((bi0) this.F).A(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.E).charAt(i - 1)));
        return i;
    }

    @Override // defpackage.d6b
    public ByteBuffer r(int i) {
        return ((MediaCodec) this.E).getInputBuffer(i);
    }

    @Override // defpackage.d6b
    public void s(Surface surface) {
        ((MediaCodec) this.E).setOutputSurface(surface);
    }

    @Override // defpackage.d6b
    public ByteBuffer t(int i) {
        return ((MediaCodec) this.E).getOutputBuffer(i);
    }

    @Override // defpackage.d6b
    public void v(ArrayList arrayList) {
        ((MediaCodec) this.E).subscribeToVendorParameters(arrayList);
    }

    @Override // defpackage.d6b
    public void w(w6b w6bVar, Handler handler) {
        ((MediaCodec) this.E).setOnFrameRenderedListener(new k11(this, w6bVar, 1), handler);
    }

    @Override // defpackage.d6b
    public void x(ArrayList arrayList) {
        ((MediaCodec) this.E).unsubscribeFromVendorParameters(arrayList);
    }

    public void y(String str, k39 k39Var) {
        String strI = vb7.i();
        ((LinkedHashMap) this.F).put("inline:".concat(strI), k39Var);
        qvk.b((xb0) this.E, strI, str);
    }

    public Object z() {
        ThreadLocal threadLocal = (ThreadLocal) this.E;
        ArrayDeque arrayDeque = (ArrayDeque) ((SoftReference) threadLocal.get()).get();
        if (arrayDeque == null) {
            arrayDeque = new ArrayDeque();
            threadLocal.set(new SoftReference(arrayDeque));
        }
        return !arrayDeque.isEmpty() ? arrayDeque.pop() : ((Supplier) this.F).get();
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x012d, code lost:
    
        ((defpackage.bm4) r1.j).getClass();
        r0 = defpackage.bm4.q(r0, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0138, code lost:
    
        if (r0 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x013e, code lost:
    
        if (r0.equals(null) == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0140, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0141, code lost:
    
        monitor-enter(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0144, code lost:
    
        if (r3 != r1.h) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0146, code lost:
    
        ((java.util.HashMap) r1.c).put(r9, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x014e, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0150, code lost:
    
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0151, code lost:
    
        if (r0 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0153, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0154, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0156, code lost:
    
        throw r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0126 A[Catch: all -> 0x0042, DONT_GENERATE, TryCatch #1 {all -> 0x0042, blocks: (B:5:0x0016, B:8:0x0022, B:14:0x0077, B:16:0x0083, B:19:0x0090, B:21:0x0092, B:23:0x0099, B:25:0x00a1, B:27:0x00a5, B:28:0x00a9, B:29:0x00bb, B:31:0x00c1, B:32:0x00f1, B:34:0x00f7, B:36:0x0101, B:37:0x0104, B:38:0x010b, B:39:0x010d, B:41:0x0117, B:44:0x0124, B:46:0x0126, B:48:0x0128, B:49:0x012c, B:11:0x0045, B:13:0x004b), top: B:76:0x0016 }] */
    @Override // defpackage.tok
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object zza() {
        /*
            Method dump skipped, instruction units count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dke.zza():java.lang.Object");
    }

    public /* synthetic */ dke(Object obj, Object obj2, boolean z) {
        this.F = obj;
        this.E = obj2;
    }

    public /* synthetic */ dke(Object obj, Object obj2) {
        this.E = obj;
        this.F = obj2;
    }

    public dke(Supplier supplier) {
        this.F = supplier;
        this.E = ThreadLocal.withInitial(new ui2(4));
    }

    public dke(MediaCodec mediaCodec, xv8 xv8Var) {
        this.E = mediaCodec;
        this.F = xv8Var;
        if (Build.VERSION.SDK_INT < 35 || xv8Var == null) {
            return;
        }
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) xv8Var.H;
        if (loudnessCodecController == null || loudnessCodecController.addMediaCodec(mediaCodec)) {
            fd9.M(((HashSet) xv8Var.F).add(mediaCodec));
        }
    }
}
