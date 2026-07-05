package defpackage;

import android.net.Uri;
import android.os.Looper;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.webkit.WebView;
import androidx.health.platform.client.proto.g;
import anthropic.claude.usercontent.sandbox.SystemSandboxToHostService;
import anthropic.claude.usercontent.sandbox.wire_format.Request;
import com.anthropic.claude.core.telemetry.SilentException;
import com.google.android.gms.internal.play_billing.e;
import com.pvporbit.freetype.FreeTypeConstants;
import com.squareup.moshi.JsonDataException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import okio.RealBufferedSink;
import okio.RealBufferedSource;
import okio.Sink;
import okio.Socket;
import okio.Source;

/* JADX INFO: loaded from: classes3.dex */
public final class mvd implements vp1, i92, ns, j4f, qef, zdc, iwj, bp1, t5k {
    public final /* synthetic */ int E;
    public Object F;
    public Object G;

    public mvd(p8i p8iVar) {
        this.E = 7;
        this.G = p8iVar;
        this.F = new dg2(new byte[4], 4);
    }

    @Override // defpackage.qef
    public void a(frh frhVar, yd7 yd7Var, t6f t6fVar) {
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:39:0x00e3
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:226)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:196)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:63)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:125)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // defpackage.vp1
    public defpackage.up1 b(defpackage.xd7 r17, long r18) {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mvd.b(xd7, long):up1");
    }

    @Override // defpackage.qef
    public void c(ssc sscVar) {
        p8i p8iVar = (p8i) this.G;
        SparseArray sparseArray = p8iVar.g;
        dg2 dg2Var = (dg2) this.F;
        if (sscVar.z() == 0 && (sscVar.z() & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
            sscVar.N(6);
            int iA = sscVar.a() / 4;
            for (int i = 0; i < iA; i++) {
                sscVar.k(dg2Var.b, 0, 4);
                dg2Var.m(0);
                int iG = dg2Var.g(16);
                dg2Var.o(3);
                if (iG == 0) {
                    dg2Var.o(13);
                } else {
                    int iG2 = dg2Var.g(13);
                    if (sparseArray.get(iG2) == null) {
                        f4i f4iVar = new f4i();
                        f4iVar.I = p8iVar;
                        f4iVar.F = new dg2(new byte[5], 5);
                        f4iVar.G = new SparseArray();
                        f4iVar.H = new SparseIntArray();
                        f4iVar.E = iG2;
                        sparseArray.put(iG2, new ref(f4iVar));
                        p8iVar.m++;
                    }
                }
            }
            sparseArray.remove(0);
        }
    }

    @Override // defpackage.bp1
    public void d(hp1 hp1Var) {
        jyj.g("BillingClient", "Reconnection finished with result: " + hp1Var.a);
        try {
            ((e) this.F).a(hp1Var);
        } catch (Throwable th) {
            jyj.i("BillingClient", "Exception setting completer.", th);
        }
        zo1 zo1Var = (zo1) this.G;
        if (zo1Var.B != null) {
            t08 t08Var = new t08(this, 12, hp1Var);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                t08Var.run();
            } else {
                zo1Var.e.post(t08Var);
            }
        }
    }

    @Override // defpackage.t5k
    public void e(fba fbaVar) {
        throw new IllegalStateException();
    }

    @Override // defpackage.ns
    public void f(y7e y7eVar) {
        y7eVar.getClass();
        if (vok.k(y7eVar, (aqh) this.F)) {
            ((fs) this.G).b(y7eVar);
        }
    }

    @Override // defpackage.bp1
    public void g() {
        jyj.g("BillingClient", "Reconnection attempt failed.");
        try {
            ((e) this.F).a(y3k.h);
        } catch (Throwable th) {
            jyj.i("BillingClient", "Exception setting completer.", th);
        }
        zo1 zo1Var = (zo1) this.G;
        if (zo1Var.B != null) {
            k51 k51Var = new k51(18, this);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                k51Var.run();
            } else {
                zo1Var.e.post(k51Var);
            }
        }
    }

    @Override // defpackage.j4f
    public String getName() {
        return "rpcRequest";
    }

    @Override // defpackage.ns
    public Object getResult() {
        return ((fs) this.G).a();
    }

    @Override // defpackage.vp1
    public void h() {
        ssc sscVar = (ssc) this.G;
        byte[] bArr = tpi.b;
        sscVar.getClass();
        sscVar.K(bArr, bArr.length);
    }

    public Object i() {
        if (k()) {
            return this.F;
        }
        sz6.j("No value in this thread (hasValue should be checked before)");
        return null;
    }

    @Override // defpackage.iwj
    public c61 j(lsj lsjVar) {
        c61 c61VarL = ((c61) this.F).L();
        c61VarL.Q((String) this.G, lsjVar);
        return c61VarL;
    }

    public boolean k() {
        return ((Thread) this.G) == Thread.currentThread();
    }

    @Override // defpackage.t5k
    public void l() {
        ((j5h) this.G).d(null);
    }

    public void m(Object obj) {
        h8j h8jVar = (h8j) obj;
        List list = xah.a;
        cpc cpcVar = new cpc("ui_thread_ms", h8jVar.getTotalTimeInUiThreadMillis());
        cpc cpcVar2 = new cpc("max_task_ms", h8jVar.getMaxTimePerTaskInUiThreadMillis());
        List listA = h8jVar.a();
        xah.e(2, "startUpWebView done", null, sta.h0(cpcVar, cpcVar2, new cpc("blocking_locations", listA != null ? Integer.valueOf(listA.size()) : null)));
        ql8.m((AtomicBoolean) this.F, (ua2) this.G);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:182:0x062e  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0c3f  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0c43  */
    /* JADX WARN: Removed duplicated region for block: B:397:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:490:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v153, types: [lsj] */
    /* JADX WARN: Type inference failed for: r11v156, types: [lsj] */
    /* JADX WARN: Type inference failed for: r11v168, types: [lsj] */
    /* JADX WARN: Type inference failed for: r11v171, types: [lsj] */
    /* JADX WARN: Type inference failed for: r11v179, types: [ltj] */
    /* JADX WARN: Type inference failed for: r11v180, types: [ltj] */
    /* JADX WARN: Type inference failed for: r11v196, types: [ltj] */
    /* JADX WARN: Type inference failed for: r11v197, types: [ltj] */
    /* JADX WARN: Type inference failed for: r11v280, types: [lsj] */
    /* JADX WARN: Type inference failed for: r11v283, types: [lsj] */
    /* JADX WARN: Type inference failed for: r11v298 */
    /* JADX WARN: Type inference failed for: r11v325, types: [jqj] */
    /* JADX WARN: Type inference failed for: r11v332, types: [isj] */
    /* JADX WARN: Type inference failed for: r11v336 */
    /* JADX WARN: Type inference failed for: r11v394 */
    /* JADX WARN: Type inference failed for: r11v395 */
    /* JADX WARN: Type inference failed for: r11v82, types: [pqj] */
    /* JADX WARN: Type inference failed for: r11v83, types: [pqj] */
    /* JADX WARN: Type inference failed for: r12v0, types: [c61, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v47, types: [lsj] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.lsj n(defpackage.c61 r12, defpackage.lsj r13) {
        /*
            Method dump skipped, instruction units count: 3808
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mvd.n(c61, lsj):lsj");
    }

    public void o(gtj gtjVar) {
        Iterator it = gtjVar.a.iterator();
        while (it.hasNext()) {
            ((HashMap) this.F).put(((lxj) it.next()).toString(), gtjVar);
        }
    }

    @Override // defpackage.i7j
    public void o0(WebView webView, ep1 ep1Var, Uri uri, boolean z, oe9 oe9Var) {
        Request request;
        t4f t4fVar = (t4f) this.G;
        webView.getClass();
        uri.getClass();
        oe9Var.getClass();
        if (z) {
            try {
                String strB = ep1Var.b();
                if (strB == null || (request = (Request) t4fVar.G.a(Request.class).fromJson(strB)) == null) {
                    return;
                }
                String method = request.getMethod();
                if (x44.r(method, SystemSandboxToHostService.ReadyForContent)) {
                    t4fVar.Q.c0(iei.a);
                } else if (x44.r(method, SystemSandboxToHostService.OpenExternal)) {
                    t4f.e(t4fVar, request);
                }
                n4f clientRpcListener = t4fVar.getClientRpcListener();
                if (clientRpcListener != null) {
                    clientRpcListener.m(request);
                }
                vtk.g(request.getPayload());
            } catch (JsonDataException e) {
                SilentException.a(new SilentException("SandboxWebView: Error handling request", e), null, false, 3);
            }
        }
    }

    @Override // defpackage.zdc
    public void onComplete(d5h d5hVar) {
        switch (this.E) {
            case 9:
                flj fljVar = (flj) this.F;
                j5h j5hVar = (j5h) this.G;
                synchronized (fljVar.f) {
                    fljVar.e.remove(j5hVar);
                    break;
                }
                return;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                y0l y0lVar = (y0l) this.F;
                j5h j5hVar2 = (j5h) this.G;
                synchronized (y0lVar.f) {
                    y0lVar.e.remove(j5hVar2);
                    break;
                }
                return;
            case g.MAX_FIELD_NUMBER /* 17 */:
                s4l s4lVar = (s4l) this.F;
                j5h j5hVar3 = (j5h) this.G;
                synchronized (s4lVar.f) {
                    s4lVar.e.remove(j5hVar3);
                    break;
                }
                return;
            default:
                u5l u5lVar = (u5l) this.F;
                j5h j5hVar4 = (j5h) this.G;
                synchronized (u5lVar.f) {
                    u5lVar.e.remove(j5hVar4);
                    break;
                }
                return;
        }
    }

    @Override // defpackage.i92
    public void onFailure(v82 v82Var, IOException iOException) {
        p5e.e((p5e) this.F, iOException, null, 6);
    }

    @Override // defpackage.i92
    public void onResponse(v82 v82Var, pqe pqeVar) {
        Source sourceD;
        Sink sinkN;
        int iIntValue;
        int i;
        int i2;
        String strSubstring;
        try {
            Socket socketB = ((p5e) this.F).b(pqeVar);
            wg8 wg8Var = pqeVar.J;
            int size = wg8Var.size();
            int i3 = 0;
            int i4 = 0;
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            Integer numR0 = null;
            Integer numR02 = null;
            while (i4 < size) {
                if (wg8Var.e(i4).equalsIgnoreCase("Sec-WebSocket-Extensions")) {
                    String strK = wg8Var.k(i4);
                    int i5 = i3;
                    while (i5 < strK.length()) {
                        wg8 wg8Var2 = wg8Var;
                        int iE = zkj.e(strK, ',', i5, i3, 4);
                        int iD = zkj.d(strK, ';', i5, iE);
                        int iH = zkj.h(i5, iD, strK);
                        String strSubstring2 = strK.substring(iH, zkj.i(iH, iD, strK));
                        int i6 = iD + 1;
                        if (strSubstring2.equalsIgnoreCase("permessage-deflate")) {
                            if (z) {
                                z4 = true;
                            }
                            i5 = i6;
                            while (i5 < iE) {
                                int iD2 = zkj.d(strK, ';', i5, iE);
                                int iD3 = zkj.d(strK, '=', i5, iD2);
                                int iH2 = zkj.h(i5, iD3, strK);
                                String strSubstring3 = strK.substring(iH2, zkj.i(iH2, iD3, strK));
                                if (iD3 < iD2) {
                                    int iH3 = zkj.h(iD3 + 1, iD2, strK);
                                    strSubstring = strK.substring(iH3, zkj.i(iH3, iD2, strK));
                                    i = iE;
                                    i2 = size;
                                    if (strSubstring.length() >= 2 && bsg.Z0("\"", strSubstring) && bsg.A0(strSubstring, "\"")) {
                                        strSubstring = vb7.j(1, 1, strSubstring);
                                    }
                                } else {
                                    i = iE;
                                    i2 = size;
                                    strSubstring = null;
                                }
                                int i7 = iD2 + 1;
                                if (strSubstring3.equalsIgnoreCase("client_max_window_bits")) {
                                    if (numR0 != null) {
                                        z4 = true;
                                    }
                                    numR0 = strSubstring != null ? isg.r0(10, strSubstring) : null;
                                    if (numR0 == null) {
                                        i5 = i7;
                                        iE = i;
                                        size = i2;
                                        z4 = true;
                                    } else {
                                        i5 = i7;
                                        iE = i;
                                        size = i2;
                                    }
                                } else if (strSubstring3.equalsIgnoreCase("client_no_context_takeover")) {
                                    if (z2) {
                                        z4 = true;
                                    }
                                    if (strSubstring != null) {
                                        z4 = true;
                                    }
                                    i5 = i7;
                                    iE = i;
                                    size = i2;
                                    z2 = true;
                                } else {
                                    if (strSubstring3.equalsIgnoreCase("server_max_window_bits")) {
                                        if (numR02 != null) {
                                            z4 = true;
                                        }
                                        numR02 = strSubstring != null ? isg.r0(10, strSubstring) : null;
                                        if (numR02 != null) {
                                            i5 = i7;
                                            iE = i;
                                            size = i2;
                                        }
                                    } else if (strSubstring3.equalsIgnoreCase("server_no_context_takeover")) {
                                        if (z3) {
                                            z4 = true;
                                        }
                                        if (strSubstring != null) {
                                            z4 = true;
                                        }
                                        i5 = i7;
                                        iE = i;
                                        size = i2;
                                        z3 = true;
                                    }
                                    i5 = i7;
                                    iE = i;
                                    size = i2;
                                    z4 = true;
                                }
                            }
                            wg8Var = wg8Var2;
                            i3 = 0;
                            z = true;
                        } else {
                            i5 = i6;
                            wg8Var = wg8Var2;
                            i3 = 0;
                            z4 = true;
                        }
                    }
                }
                i4++;
                wg8Var = wg8Var;
                size = size;
                i3 = 0;
            }
            int i8 = 2;
            ((p5e) this.F).e = new z6j(z, numR0, z2, numR02, z3, z4);
            if (z4 || numR0 != null || (numR02 != null && (8 > (iIntValue = numR02.intValue()) || iIntValue >= 16))) {
                p5e p5eVar = (p5e) this.F;
                synchronized (p5eVar) {
                    p5eVar.q.clear();
                    p5eVar.c(1010, "unexpected Sec-WebSocket-Extensions in response header");
                }
            }
            String str = blj.b + " WebSocket " + ((kie) this.G).a.h();
            p5e p5eVar2 = (p5e) this.F;
            fj0 fj0Var = new fj0(socketB);
            z6j z6jVar = p5eVar2.e;
            z6jVar.getClass();
            synchronized (p5eVar2) {
                try {
                    p5eVar2.n = str;
                    p5eVar2.o = fj0Var;
                    p5eVar2.l = new e7j((RealBufferedSink) fj0Var.G, p5eVar2.c, z6jVar.a, z6jVar.c, p5eVar2.f);
                    p5eVar2.j = new o5e(p5eVar2);
                    long j = p5eVar2.d;
                    if (j != 0) {
                        long nanos = TimeUnit.MILLISECONDS.toNanos(j);
                        m7h m7hVar = p5eVar2.m;
                        String strConcat = str.concat(" ping");
                        nx4 nx4Var = new nx4(p5eVar2, nanos, i8);
                        m7hVar.getClass();
                        m7hVar.c(new o5e(nx4Var, strConcat), nanos);
                    }
                    if (!p5eVar2.q.isEmpty()) {
                        p5eVar2.g();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            p5eVar2.k = new c7j((RealBufferedSource) fj0Var.F, p5eVar2, z6jVar.a, z6jVar.e);
            p5e p5eVar3 = (p5e) this.F;
            try {
                p5eVar3.b.o(p5eVar3, pqeVar);
                while (p5eVar3.t == -1) {
                    c7j c7jVar = p5eVar3.k;
                    c7jVar.getClass();
                    c7jVar.c();
                }
            } catch (Exception e) {
                p5e.e(p5eVar3, e, null, 6);
            } finally {
                p5eVar3.f();
            }
        } catch (IOException e2) {
            p5e.e((p5e) this.F, e2, pqeVar, 4);
            zkj.b(pqeVar);
            Socket socket = pqeVar.L;
            if (socket != null && (sinkN = socket.n()) != null) {
                zkj.b(sinkN);
            }
            Socket socket2 = pqeVar.L;
            if (socket2 == null || (sourceD = socket2.d()) == null) {
                return;
            }
            zkj.b(sourceD);
        }
    }

    @Override // defpackage.t5k
    public fba zza() {
        return (fba) this.F;
    }

    public /* synthetic */ mvd(Object obj, int i, Object obj2) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
    }

    public /* synthetic */ mvd(Object obj, Object obj2, boolean z, int i) {
        this.E = i;
        this.G = obj;
        this.F = obj2;
    }

    public mvd(Object obj) {
        this.E = 5;
        this.F = obj;
        this.G = Thread.currentThread();
    }

    public mvd(frh frhVar) {
        this.E = 0;
        this.F = frhVar;
        this.G = new ssc();
    }

    public mvd(t4f t4fVar) {
        this.E = 4;
        this.G = t4fVar;
        this.F = csg.V("\n            window.addEventListener('message', function(event) {\n                var cf = document.getElementById('contentIframe');\n                if (!cf || event.source !== cf.contentWindow) { return; }\n                if (event.data && event.data.channel === 'request') {\n                    console.log(\"Received RPC request:\", event.data.method, event.data.request_id);\n                    rpcRequest.postMessage(JSON.stringify(event.data));\n                }\n            });\n        ");
    }

    public /* synthetic */ mvd(int i) {
        this.E = i;
    }
}
