package defpackage;

import android.content.ClipDescription;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Parcel;
import android.view.inputmethod.InputContentInfo;
import android.widget.EditText;
import android.widget.TextView;
import androidx.concurrent.futures.b;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.work.impl.WorkDatabase;
import anthropic.claude.usercontent.sandbox.wire_format.Response;
import com.anthropic.claude.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class ax5 implements cc9, kbc, lfh, see, hf5, neg, n4f, i92, ljd {
    public final /* synthetic */ int E;
    public Object F;

    public ax5(int i) {
        this.E = i;
        switch (i) {
            case 28:
                fwb fwbVar = v6f.a;
                this.F = new fwb();
                break;
            default:
                this.F = new z5l();
                break;
        }
    }

    public static ixg B(ns5 ns5Var, kx8 kx8Var, nab nabVar, pab pabVar) {
        BitmapDrawable bitmapDrawable = new BitmapDrawable(kx8Var.a.getResources(), pabVar.a);
        Map map = pabVar.b;
        Object obj = map.get("coil#disk_cache_key");
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = map.get("coil#is_sampled");
        Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
        boolean z = false;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Bitmap.Config[] configArr = l.a;
        if (ns5Var != null && ns5Var.b) {
            z = true;
        }
        return new ixg(bitmapDrawable, kx8Var, rg5.E, nabVar, str, zBooleanValue, z);
    }

    public nab A(kx8 kx8Var, Object obj, rjc rjcVar, rz6 rz6Var) {
        String strA;
        Map linkedHashMap;
        kx8Var.getClass();
        List list = kx8Var.f;
        List list2 = ((s4e) this.F).d.c;
        int size = list2.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                strA = null;
                break;
            }
            cpc cpcVar = (cpc) list2.get(i);
            qp9 qp9Var = (qp9) cpcVar.E;
            if (((Class) cpcVar.F).isAssignableFrom(obj.getClass())) {
                qp9Var.getClass();
                strA = qp9Var.a(obj, rjcVar);
                if (strA != null) {
                    break;
                }
            }
            i++;
        }
        if (strA == null) {
            return null;
        }
        Map map = kx8Var.x.E;
        boolean zIsEmpty = map.isEmpty();
        nm6 nm6Var = nm6.E;
        if (zIsEmpty) {
            linkedHashMap = nm6Var;
        } else {
            linkedHashMap = new LinkedHashMap();
            Iterator it = map.entrySet().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getValue().getClass();
                mr9.o();
                return null;
            }
        }
        if (list.isEmpty() && linkedHashMap.isEmpty()) {
            return new nab(strA, nm6Var);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        if (!list.isEmpty()) {
            if (list.size() > 0) {
                list.get(0).getClass();
                mr9.o();
                return null;
            }
            linkedHashMap2.put("coil#transformation_size", rjcVar.c.toString());
        }
        return new nab(strA, linkedHashMap2);
    }

    public void C(Exception exc) {
        ysj.k("MediaCodecAudioRenderer", "Audio sink error", exc);
        i49 i49Var = ((e6b) this.F).m1;
        Handler handler = (Handler) i49Var.F;
        if (handler != null) {
            handler.post(new n51(i49Var, exc, 8));
        }
    }

    public void D(tg6 tg6Var) {
    }

    public void E() {
        ((InputContentInfo) ((ro6) this.F).F).requestPermission();
    }

    public ArrayList F(int i) {
        ArrayList arrayList = new ArrayList();
        lx9 lx9Var = (lx9) this.F;
        rcg rcgVarZ = fd9.Z();
        bz7 bz7VarE = rcgVarZ != null ? rcgVarZ.e() : null;
        rcg rcgVarK0 = fd9.k0(rcgVarZ);
        try {
            dx9 dx9Var = lx9Var.b ? lx9Var.c : (dx9) lx9Var.e.getValue();
            if (dx9Var != null) {
                bae baeVar = new bae();
                baeVar.E = 1;
                List list = (List) dx9Var.k.invoke(Integer.valueOf(i));
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    cpc cpcVar = (cpc) list.get(i2);
                    xz9 xz9Var = lx9Var.o;
                    int iIntValue = ((Number) cpcVar.E).intValue();
                    long j = ((rl4) cpcVar.F).a;
                    y5f y5fVar = lx9.w;
                    baeVar = baeVar;
                    arrayList.add(xz9Var.a(iIntValue, j, false, new fe((ArrayList) null, baeVar, list, i, dx9Var)));
                }
            }
            fd9.s0(rcgVarZ, rcgVarK0, bz7VarE);
            return arrayList;
        } catch (Throwable th) {
            fd9.s0(rcgVarZ, rcgVarK0, bz7VarE);
            throw th;
        }
    }

    @Override // defpackage.kbc
    public void G(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        gl7 gl7Var = (gl7) this.F;
        Handler handler = gl7Var.O0;
        k51 k51Var = gl7Var.P0;
        handler.removeCallbacks(k51Var);
        TextView textView = gl7Var.U0;
        if (textView != null) {
            textView.setText(charSequence);
        }
        handler.postDelayed(k51Var, 2000L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:526:0x0a67, code lost:
    
        if (r65 <= 0) goto L542;
     */
    /* JADX WARN: Code restructure failed: missing block: B:527:0x0a69, code lost:
    
        r1 = r10.shiftLeft(1).compareTo(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:528:0x0a72, code lost:
    
        if (r1 > 0) goto L533;
     */
    /* JADX WARN: Code restructure failed: missing block: B:529:0x0a74, code lost:
    
        if (r1 != 0) goto L532;
     */
    /* JADX WARN: Code restructure failed: missing block: B:531:0x0a78, code lost:
    
        if ((r7 & 1) == 1) goto L533;
     */
    /* JADX WARN: Code restructure failed: missing block: B:533:0x0a7c, code lost:
    
        r0 = (char) (r7 + 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:534:0x0a81, code lost:
    
        if (r7 != '9') goto L541;
     */
    /* JADX WARN: Code restructure failed: missing block: B:535:0x0a83, code lost:
    
        r4.append('9');
     */
    /* JADX WARN: Code restructure failed: missing block: B:536:0x0a8a, code lost:
    
        if (defpackage.puj.j(r4) == false) goto L539;
     */
    /* JADX WARN: Code restructure failed: missing block: B:537:0x0a8c, code lost:
    
        r11 = r16 + 1;
        r4.append('1');
     */
    /* JADX WARN: Code restructure failed: missing block: B:539:0x0a95, code lost:
    
        r11 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:540:0x0a98, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:541:0x0a9a, code lost:
    
        r7 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:543:0x0a9e, code lost:
    
        r4.append(r7);
        r11 = r16 + 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:205:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x05a9  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x05f7  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0602  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x06d8  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x06dc  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x07b4  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x07b9  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x07bd  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x07c1  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x07d0  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0830  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0832  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x086c  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0879  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x087b  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0882  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x08b8  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x08e5  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x08f2  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x0909  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x0912  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x0918  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x091d  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x0926  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x092d  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x0933  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x093c  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x0959  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x0986  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x0988  */
    /* JADX WARN: Removed duplicated region for block: B:544:0x0aa4  */
    /* JADX WARN: Removed duplicated region for block: B:561:0x0aea  */
    /* JADX WARN: Removed duplicated region for block: B:563:0x0af0  */
    /* JADX WARN: Removed duplicated region for block: B:596:0x0b5b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void H(java.lang.Object r66) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 3122
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ax5.H(java.lang.Object):void");
    }

    @Override // defpackage.n4f
    public void I(Response response) {
    }

    public void J(String str) {
        StringBuilder sb = (StringBuilder) this.F;
        sb.append('\"');
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        for (int i = 0; i < length; i++) {
            char c = charArray[i];
            if (c == '\f') {
                o('f');
            } else if (c == '\r') {
                o('r');
            } else if (c != '\"' && c != '\\') {
                switch (c) {
                    case '\b':
                        o('b');
                        break;
                    case '\t':
                        o('t');
                        break;
                    case '\n':
                        o('n');
                        break;
                    default:
                        if (c < ' ') {
                            o('u');
                            for (int i2 = 0; i2 < 4; i2++) {
                                int i3 = c >>> '\f';
                                sb.append((char) (i3 > 9 ? i3 + 87 : i3 + 48));
                                c = (char) (c << 4);
                            }
                        } else {
                            sb.append(c);
                        }
                        break;
                }
            } else {
                o(c);
            }
        }
        sb.append('\"');
    }

    public void K(Object obj) {
        ((cx5) this.F).k(obj);
    }

    public void L(Exception exc) {
        ((cx5) this.F).l(exc);
    }

    @Override // defpackage.cc9
    public boolean a() {
        return false;
    }

    @Override // defpackage.see
    public void accept(Object obj, Object obj2) {
        do3 do3Var = (do3) this.F;
        j99 j99Var = new j99(0, (j5h) obj2);
        mu8 mu8Var = (mu8) ((ou8) ((dre) obj).t());
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService");
        int i = wyj.a;
        parcelObtain.writeInt(1);
        do3Var.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(j99Var);
        mu8Var.b(parcelObtain, 4);
    }

    @Override // defpackage.cc9
    public saa c(String str) {
        b bVar = new b();
        bVar.c = new dne();
        o92 o92Var = new o92(bVar);
        bVar.b = o92Var;
        bVar.a = sq6.class;
        try {
            bVar.b(((ep1) this.F).k());
            bVar.a = "evaluateJavascript Future";
            return o92Var;
        } catch (Exception e) {
            o92Var.F.l(e);
            return o92Var;
        }
    }

    @Override // defpackage.cc9
    public void close() {
    }

    @Override // defpackage.hf5
    public Iterable e(Object obj) {
        wj9 wj9Var = (wj9) this.F;
        Collection collectionB = ((qqb) obj).p().b();
        collectionB.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionB.iterator();
        while (it.hasNext()) {
            xh3 xh3VarA = ((yr9) it.next()).O().a();
            xh3 xh3VarA2 = xh3VarA != null ? xh3VarA.a() : null;
            qqb qqbVar = xh3VarA2 instanceof qqb ? (qqb) xh3VarA2 : null;
            vx9 vx9VarA = qqbVar != null ? wj9Var.a(qqbVar) : null;
            if (vx9VarA != null) {
                arrayList.add(vx9VarA);
            }
        }
        return arrayList;
    }

    public void f(tg6 tg6Var) {
    }

    @Override // defpackage.ljd
    public void g(dxc dxcVar, a2h a2hVar) {
        dxcVar.getClass();
        a2hVar.getClass();
        gbf feature = ((k99) this.F).getFeature("profiling");
        if (feature != null) {
            feature.b(um6.E, new fjd(this, dxcVar, a2hVar, 0));
        }
    }

    public void h(int i, boolean z) {
        z5l z5lVar = (z5l) this.F;
        if (z) {
            z5lVar.a(i);
        } else {
            z5lVar.getClass();
        }
    }

    public void i(byte b) {
        ((Parcel) this.F).writeByte(b);
    }

    public void j(float f) {
        ((Parcel) this.F).writeFloat(f);
    }

    @Override // defpackage.lfh
    public void k(ta4 ta4Var, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-606971619);
        int i2 = (e18Var.f(this) ? 32 : 16) | i;
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            if (((yih) this.F).d().G.length() == 0) {
                e18Var.a0(-479072255);
                tjh.b(d4c.j0(R.string.internal_setting_growthbook_editor_add_custom_feature_hint, e18Var), null, gm3.a(e18Var).O, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tkh.b(((jm3) gm3.c(e18Var).e.E).g, 0L, 0L, null, null, xt7.H, 0L, null, 0, 0L, null, 0, 16777183), e18Var, 0, 0, 131066);
                e18Var = e18Var;
                e18Var.p(false);
            } else {
                e18Var.a0(-478700379);
                e18Var.p(false);
            }
            ta4Var.invoke(e18Var, 6);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new um5(this, ta4Var, i, 21);
        }
    }

    public void l(long j) {
        long jB = clh.b(j);
        byte b = 0;
        if (!dlh.a(jB, 0L)) {
            if (dlh.a(jB, 4294967296L)) {
                b = 1;
            } else if (dlh.a(jB, 8589934592L)) {
                b = 2;
            }
        }
        i(b);
        if (dlh.a(clh.b(j), 0L)) {
            return;
        }
        j(clh.c(j));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    @Override // defpackage.n4f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m(anthropic.claude.usercontent.sandbox.wire_format.Request r10) {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ax5.m(anthropic.claude.usercontent.sandbox.wire_format.Request):void");
    }

    public void n(long j) {
        long j2 = 63 & j;
        if (Long.compareUnsigned(j2, 16L) >= 0) {
            j = (j & (-64)) | (j2 - 1);
        }
        ((Parcel) this.F).writeLong(j);
    }

    public void o(char c) {
        StringBuilder sb = (StringBuilder) this.F;
        sb.append('\\');
        sb.append(c);
    }

    @Override // defpackage.i92
    public void onFailure(v82 v82Var, IOException iOException) {
        ((exf) this.F).m(iOException);
    }

    @Override // defpackage.i92
    public void onResponse(v82 v82Var, pqe pqeVar) {
        ((exf) this.F).l(pqeVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0104 A[PHI: r16 r17 r18
      0x0104: PHI (r16v1 pab) = (r16v0 pab), (r16v0 pab), (r16v2 pab) binds: [B:66:0x0101, B:61:0x00f5, B:54:0x00e0] A[DONT_GENERATE, DONT_INLINE]
      0x0104: PHI (r17v2 pab) = (r17v1 pab), (r17v1 pab), (r17v3 pab) binds: [B:66:0x0101, B:61:0x00f5, B:54:0x00e0] A[DONT_GENERATE, DONT_INLINE]
      0x0104: PHI (r18v2 double) = (r18v1 double), (r18v1 double), (r18v3 double) binds: [B:66:0x0101, B:61:0x00f5, B:54:0x00e0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0113 A[PHI: r16 r17
      0x0113: PHI (r16v3 pab) = (r16v0 pab), (r16v0 pab), (r16v0 pab), (r16v1 pab), (r16v1 pab), (r16v2 pab), (r16v2 pab), (r16v4 pab) binds: [B:62:0x00f7, B:63:0x00f9, B:66:0x0101, B:74:0x010e, B:75:0x0110, B:52:0x00d4, B:54:0x00e0, B:31:0x006f] A[DONT_GENERATE, DONT_INLINE]
      0x0113: PHI (r17v4 pab) = (r17v1 pab), (r17v1 pab), (r17v1 pab), (r17v2 pab), (r17v2 pab), (r17v3 pab), (r17v3 pab), (r17v5 pab) binds: [B:62:0x00f7, B:63:0x00f9, B:66:0x0101, B:74:0x010e, B:75:0x0110, B:52:0x00d4, B:54:0x00e0, B:31:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.pab p(defpackage.kx8 r18, defpackage.nab r19, defpackage.i8g r20, defpackage.j6f r21) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ax5.p(kx8, nab, i8g, j6f):pab");
    }

    public Uri q() {
        return ((InputContentInfo) ((ro6) this.F).F).getContentUri();
    }

    public my7 r() {
        return null;
    }

    public ClipDescription s() {
        return ((InputContentInfo) ((ro6) this.F).F).getDescription();
    }

    public DrmSession$DrmSessionException t() {
        return (DrmSession$DrmSessionException) this.F;
    }

    public String toString() {
        switch (this.E) {
            case 16:
                StringBuilder sb = new StringBuilder();
                by9 by9Var = (by9) this.F;
                sb.append(by9Var);
                sb.append(": ");
                sb.append(((Map) wd6.s0(by9Var.M, by9.Q[0])).keySet());
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public Uri u() {
        return ((InputContentInfo) ((ro6) this.F).F).getLinkUri();
    }

    public ova v() {
        return (ova) this.F;
    }

    public f0 w() {
        return (f0) this.F;
    }

    public d80 x() {
        f0 f0Var = (f0) this.F;
        if (!(f0Var instanceof irc)) {
            return new d80(5);
        }
        ArrayList arrayList = ((irc) f0Var).b.b;
        d80 d80Var = new d80(5);
        d80Var.F.addAll(arrayList);
        return d80Var;
    }

    public UUID y() {
        return o22.a;
    }

    public int z() {
        return 1;
    }

    public /* synthetic */ ax5(int i, boolean z) {
        this.E = i;
    }

    public ax5(s4e s4eVar, dke dkeVar) {
        this.E = 23;
        this.F = s4eVar;
    }

    public ax5(WorkDatabase workDatabase) {
        this.E = 10;
        workDatabase.getClass();
        this.F = workDatabase;
    }

    public ax5(TextView textView) {
        this.E = 4;
        this.F = new xl6(textView);
    }

    public ax5(EditText editText) {
        this.E = 3;
        this.F = new qb5(editText);
    }

    public /* synthetic */ ax5(int i, Object obj) {
        this.E = i;
        this.F = obj;
    }
}
