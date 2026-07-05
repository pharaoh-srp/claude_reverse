package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.os.Build;
import android.os.Handler;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import com.google.crypto.tink.internal.TinkBugException;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.net.URL;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.IntConsumer;
import okio.Sink;
import okio.Socket;
import okio.Source;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class xv8 implements ur9, tc2, Socket {
    public static final Object I = new Object();
    public static final k79 J;
    public static final k79 K;
    public final /* synthetic */ int E;
    public Object F;
    public Object G;
    public Object H;

    static {
        long j = -9223372036854775807L;
        J = new k79(2, j);
        K = new k79(3, j);
    }

    public xv8(List list) {
        this.E = 28;
        this.H = list;
        this.F = new ArrayList(list.size());
        this.G = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            ((ArrayList) this.F).add(new r0g((List) ((rua) list.get(i)).b.F));
            ((ArrayList) this.G).add(((rua) list.get(i)).c.a());
        }
    }

    public static boolean k(Editable editable, KeyEvent keyEvent, boolean z) {
        qbi[] qbiVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (qbiVarArr = (qbi[]) editable.getSpans(selectionStart, selectionEnd, qbi.class)) != null && qbiVarArr.length > 0) {
                for (qbi qbiVar : qbiVarArr) {
                    int spanStart = editable.getSpanStart(qbiVar);
                    int spanEnd = editable.getSpanEnd(qbiVar);
                    if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static xv8 l(Context context) {
        return new xv8(new kq1(context, 0));
    }

    public static final xv8 m(dq9 dq9Var) throws GeneralSecurityException {
        if (dq9Var.z() <= 0) {
            rl7.j("empty keyset");
            return null;
        }
        ArrayList arrayList = new ArrayList(dq9Var.z());
        for (cq9 cq9Var : dq9Var.A()) {
            cq9Var.getClass();
            try {
                try {
                    ybi ybiVarA = gwb.b.a(jud.e(cq9Var.A().B(), cq9Var.A().C(), cq9Var.A().A(), cq9Var.C(), cq9Var.C() == bmc.RAW ? null : Integer.valueOf(cq9Var.B())));
                    int iOrdinal = cq9Var.D().ordinal();
                    if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                        throw new GeneralSecurityException("Unknown key status");
                    }
                    arrayList.add(new eq9(ybiVarA));
                } catch (GeneralSecurityException unused) {
                    arrayList.add(null);
                }
            } catch (GeneralSecurityException e) {
                throw new TinkBugException("Creating a protokey serialization failed", e);
            }
        }
        return new xv8(dq9Var, Collections.unmodifiableList(arrayList));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0045, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0082, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006c A[EDGE_INSN: B:92:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085], EDGE_INSN: B:93:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085, LOOP_LABEL: LOOP:2: B:47:0x006e->B:58:0x0085]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00a2 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean q(defpackage.ol6 r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xv8.q(ol6, android.text.Editable, int, int, boolean):boolean");
    }

    public static final xv8 x(ive iveVar, bh bhVar) throws GeneralSecurityException, IOException {
        byte[] bArr = new byte[0];
        ByteArrayInputStream byteArrayInputStream = (ByteArrayInputStream) iveVar.F;
        try {
            hn6 hn6VarA = hn6.A(byteArrayInputStream, mc7.a());
            byteArrayInputStream.close();
            if (hn6VarA.y().size() == 0) {
                rl7.j("empty keyset");
                return null;
            }
            try {
                dq9 dq9VarE = dq9.E(bhVar.b(hn6VarA.y().h(), bArr), mc7.a());
                if (dq9VarE.z() > 0) {
                    return m(dq9VarE);
                }
                throw new GeneralSecurityException("empty keyset");
            } catch (InvalidProtocolBufferException unused) {
                rl7.j("invalid keyset, corrupted key material");
                return null;
            }
        } catch (Throwable th) {
            byteArrayInputStream.close();
            throw th;
        }
    }

    public void A(int i) {
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) this.H;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.H = null;
        }
        LoudnessCodecController loudnessCodecControllerCreate = LoudnessCodecController.create(i, y46.E, new yna(this));
        this.H = loudnessCodecControllerCreate;
        Iterator it = ((HashSet) this.F).iterator();
        while (it.hasNext()) {
            if (!loudnessCodecControllerCreate.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }

    public void B(int i) {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i * 8)));
        }
        this.F = Integer.valueOf(i);
    }

    public void C() {
        ArrayList arrayList = (ArrayList) this.G;
        if (arrayList.isEmpty()) {
            return;
        }
        ((HashMap) ((qb5) this.H).F).put((hab) this.F, arrayList);
    }

    @Override // defpackage.ur9
    public sr9 a(gh3 gh3Var, xae xaeVar) {
        return ((rl) ((qb5) this.H).E).I(gh3Var, xaeVar, (ArrayList) this.G);
    }

    public tf b() throws GeneralSecurityException {
        xzd xzdVar;
        n22 n22VarA;
        ag agVar = (ag) this.F;
        if (agVar == null || (xzdVar = (xzd) this.G) == null) {
            rl7.j("Cannot build without parameters and/or key material");
            return null;
        }
        if (agVar.c != ((n22) xzdVar.F).a.length) {
            rl7.j("Key size mismatch");
            return null;
        }
        zf zfVar = agVar.e;
        zf zfVar2 = zf.J;
        if (zfVar != zfVar2 && ((Integer) this.H) == null) {
            rl7.j("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (zfVar == zfVar2 && ((Integer) this.H) != null) {
            rl7.j("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        if (zfVar == zfVar2) {
            n22VarA = n22.a(new byte[0]);
        } else if (zfVar == zf.I || zfVar == zf.H) {
            n22VarA = n22.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.H).intValue()).array());
        } else {
            if (zfVar != zf.G) {
                xh6.n("Unknown AesCmacParametersParameters.Variant: ", ((ag) this.F).e);
                return null;
            }
            n22VarA = n22.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.H).intValue()).array());
        }
        return new tf((ag) this.F, n22VarA);
    }

    public ag c() {
        Integer num = (Integer) this.F;
        if (num == null) {
            rl7.j("key size not set");
            return null;
        }
        if (((Integer) this.G) == null) {
            rl7.j("tag size not set");
            return null;
        }
        if (((zf) this.H) != null) {
            return new ag(num.intValue(), ((Integer) this.G).intValue(), (zf) this.H);
        }
        rl7.j("variant not set");
        return null;
    }

    @Override // okio.Socket
    public void cancel() {
        ((y47) ((w47) this.H).e).cancel();
    }

    @Override // okio.Socket
    public Source d() {
        return (v47) this.G;
    }

    public tg e() throws GeneralSecurityException {
        xzd xzdVar;
        xg xgVar = (xg) this.F;
        if (xgVar == null || (xzdVar = (xzd) this.G) == null) {
            rl7.j("Cannot build without parameters and/or key material");
            return null;
        }
        if (xgVar.c != ((n22) xzdVar.F).a.length) {
            rl7.j("Key size mismatch");
            return null;
        }
        wg wgVar = xgVar.f;
        wg wgVar2 = wg.I;
        if (wgVar != wgVar2 && ((Integer) this.H) == null) {
            rl7.j("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (wgVar == wgVar2 && ((Integer) this.H) != null) {
            rl7.j("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        if (wgVar == wgVar2) {
            n22.a(new byte[0]);
        } else if (wgVar == wg.H) {
            n22.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.H).intValue()).array());
        } else {
            if (wgVar != wg.G) {
                xh6.n("Unknown AesEaxParameters.Variant: ", ((xg) this.F).f);
                return null;
            }
            n22.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.H).intValue()).array());
        }
        return new tg();
    }

    public eh f() throws GeneralSecurityException {
        xzd xzdVar;
        hh hhVar = (hh) this.F;
        if (hhVar == null || (xzdVar = (xzd) this.G) == null) {
            rl7.j("Cannot build without parameters and/or key material");
            return null;
        }
        if (hhVar.c != ((n22) xzdVar.F).a.length) {
            rl7.j("Key size mismatch");
            return null;
        }
        zf zfVar = hhVar.f;
        zf zfVar2 = zf.M;
        if (zfVar != zfVar2 && ((Integer) this.H) == null) {
            rl7.j("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (zfVar == zfVar2 && ((Integer) this.H) != null) {
            rl7.j("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        if (zfVar == zfVar2) {
            n22.a(new byte[0]);
        } else if (zfVar == zf.L) {
            n22.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.H).intValue()).array());
        } else {
            if (zfVar != zf.K) {
                xh6.n("Unknown AesGcmParameters.Variant: ", ((hh) this.F).f);
                return null;
            }
            n22.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.H).intValue()).array());
        }
        return new eh();
    }

    public mh g() throws GeneralSecurityException {
        xzd xzdVar;
        ph phVar = (ph) this.F;
        if (phVar == null || (xzdVar = (xzd) this.G) == null) {
            rl7.j("Cannot build without parameters and/or key material");
            return null;
        }
        if (phVar.c != ((n22) xzdVar.F).a.length) {
            rl7.j("Key size mismatch");
            return null;
        }
        wg wgVar = phVar.d;
        wg wgVar2 = wg.L;
        if (wgVar != wgVar2 && ((Integer) this.H) == null) {
            rl7.j("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (wgVar == wgVar2 && ((Integer) this.H) != null) {
            rl7.j("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        if (wgVar == wgVar2) {
            n22.a(new byte[0]);
        } else if (wgVar == wg.K) {
            n22.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.H).intValue()).array());
        } else {
            if (wgVar != wg.J) {
                xh6.n("Unknown AesGcmSivParameters.Variant: ", ((ph) this.F).d);
                return null;
            }
            n22.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.H).intValue()).array());
        }
        return new mh();
    }

    public gn8 h() throws GeneralSecurityException {
        xzd xzdVar;
        n22 n22VarA;
        jn8 jn8Var = (jn8) this.F;
        if (jn8Var == null || (xzdVar = (xzd) this.G) == null) {
            rl7.j("Cannot build without parameters and/or key material");
            return null;
        }
        if (jn8Var.c != ((n22) xzdVar.F).a.length) {
            rl7.j("Key size mismatch");
            return null;
        }
        wg wgVar = jn8Var.e;
        wg wgVar2 = wg.W;
        if (wgVar != wgVar2 && ((Integer) this.H) == null) {
            rl7.j("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (wgVar == wgVar2 && ((Integer) this.H) != null) {
            rl7.j("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        if (wgVar == wgVar2) {
            n22VarA = n22.a(new byte[0]);
        } else if (wgVar == wg.V || wgVar == wg.U) {
            n22VarA = n22.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.H).intValue()).array());
        } else {
            if (wgVar != wg.T) {
                xh6.n("Unknown HmacParameters.Variant: ", ((jn8) this.F).e);
                return null;
            }
            n22VarA = n22.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.H).intValue()).array());
        }
        return new gn8((jn8) this.F, n22VarA);
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int i(int r15) {
        /*
            Method dump skipped, instruction units count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xv8.i(int):int");
    }

    public int j() {
        bm4 bm4Var = (bm4) this.H;
        if (bm4Var == null) {
            Log.e("BiometricManager", "Failure in canAuthenticate(). FingerprintManager was null.");
            return 1;
        }
        bm4Var.getClass();
        return 12;
    }

    @Override // okio.Socket
    public Sink n() {
        return (u47) this.F;
    }

    public long o() {
        fr5 fr5Var = (fr5) this.H;
        if (fr5Var != null) {
            return fr5Var.H;
        }
        return -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object p(java.lang.Class r18) throws java.security.GeneralSecurityException {
        /*
            Method dump skipped, instruction units count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xv8.p(java.lang.Class):java.lang.Object");
    }

    @Override // defpackage.tc2
    public void p0(ee2 ee2Var, pd1 pd1Var) {
        ge2 ge2Var = (ge2) this.F;
        if (ge2Var == null) {
            x44.o0("context");
            throw null;
        }
        sp0 sp0Var = (sp0) this.H;
        if (sp0Var == null) {
            x44.o0("layerMargins");
            throw null;
        }
        oub oubVar = (oub) this.G;
        if (oubVar == null) {
            x44.o0("layerDimensions");
            throw null;
        }
        if (ee2Var == null) {
            return;
        }
        pd1Var.a(ge2Var, sp0Var, oubVar, ee2Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x03b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x01fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x021c  */
    /* JADX WARN: Type inference failed for: r0v167 */
    /* JADX WARN: Type inference failed for: r0v168 */
    /* JADX WARN: Type inference failed for: r0v169 */
    /* JADX WARN: Type inference failed for: r0v170 */
    /* JADX WARN: Type inference failed for: r0v89 */
    /* JADX WARN: Type inference failed for: r0v90, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean r() {
        /*
            Method dump skipped, instruction units count: 1425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xv8.r():boolean");
    }

    public boolean s(CharSequence charSequence, int i, int i2, pbi pbiVar) {
        if ((pbiVar.c & 3) == 0) {
            kr5 kr5Var = (kr5) this.H;
            njb njbVarB = pbiVar.b();
            int iA = njbVarB.a(8);
            if (iA != 0) {
                ((ByteBuffer) njbVarB.d).getShort(iA + njbVarB.a);
            }
            kr5Var.getClass();
            ThreadLocal threadLocal = kr5.b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            boolean zHasGlyph = kr5Var.a.hasGlyph(sb.toString());
            int i3 = pbiVar.c & 4;
            pbiVar.c = zHasGlyph ? i3 | 2 : i3 | 1;
        }
        return (pbiVar.c & 3) == 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void t(defpackage.tg5 r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, defpackage.ekd r15) throws androidx.media3.exoplayer.source.UnrecognizedInputFormatException {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xv8.t(tg5, android.net.Uri, java.util.Map, long, long, ekd):void");
    }

    public String toString() {
        switch (this.E) {
            case BuildConfig.VERSION_CODE /* 25 */:
                return qpi.a((dq9) this.F).toString();
            default:
                return super.toString();
        }
    }

    public boolean u() {
        return ((xba) this.G) != null;
    }

    public Object v(CharSequence charSequence, int i, int i2, int i3, boolean z, sl6 sl6Var) {
        int i4;
        char c;
        ul6 ul6Var = new ul6((sjb) ((c61) this.G).H);
        int iCodePointAt = Character.codePointAt(charSequence, i);
        int i5 = 0;
        boolean zE = true;
        int iCharCount = i;
        loop0: while (true) {
            i4 = iCharCount;
            while (iCharCount < i2 && i5 < i3 && zE) {
                SparseArray sparseArray = ul6Var.c.a;
                sjb sjbVar = sparseArray == null ? null : (sjb) sparseArray.get(iCodePointAt);
                if (ul6Var.a == 2) {
                    if (sjbVar != null) {
                        ul6Var.c = sjbVar;
                        ul6Var.f++;
                    } else {
                        if (iCodePointAt == 65038) {
                            ul6Var.a();
                        } else if (iCodePointAt != 65039) {
                            sjb sjbVar2 = ul6Var.c;
                            if (sjbVar2.b != null) {
                                if (ul6Var.f != 1) {
                                    ul6Var.d = sjbVar2;
                                    ul6Var.a();
                                } else if (ul6Var.b()) {
                                    ul6Var.d = ul6Var.c;
                                    ul6Var.a();
                                } else {
                                    ul6Var.a();
                                }
                                c = 3;
                            } else {
                                ul6Var.a();
                            }
                        }
                        c = 1;
                    }
                    c = 2;
                } else if (sjbVar == null) {
                    ul6Var.a();
                    c = 1;
                } else {
                    ul6Var.a = 2;
                    ul6Var.c = sjbVar;
                    ul6Var.f = 1;
                    c = 2;
                }
                ul6Var.e = iCodePointAt;
                if (c == 1) {
                    iCharCount = Character.charCount(Character.codePointAt(charSequence, i4)) + i4;
                    if (iCharCount < i2) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                    }
                } else if (c == 2) {
                    int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                    if (iCharCount2 < i2) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                    }
                    iCharCount = iCharCount2;
                } else if (c == 3) {
                    if (z || !s(charSequence, i4, iCharCount, ul6Var.d.b)) {
                        zE = sl6Var.e(charSequence, i4, iCharCount, ul6Var.d.b);
                        i5++;
                    }
                }
            }
            break loop0;
        }
        if (ul6Var.a == 2 && ul6Var.c.b != null && ((ul6Var.f > 1 || ul6Var.b()) && i5 < i3 && zE && (z || !s(charSequence, i4, iCharCount, ul6Var.c.b)))) {
            sl6Var.e(charSequence, i4, iCharCount, ul6Var.c.b);
        }
        return sl6Var.getResult();
    }

    public Object w(za1 za1Var, xzg xzgVar) {
        e50 e50Var = (e50) this.F;
        int i = 0;
        int i2 = 1;
        m45 m45Var = m45.E;
        iei ieiVar = iei.a;
        tp4 tp4Var = null;
        if (e50Var != null) {
            e50Var.g.setValue(za1Var.b);
            Object objA = e50.a(new pz7[]{new y40(e50Var, za1Var, tp4Var, i), new y40(e50Var, za1Var, tp4Var, i2)}, xzgVar);
            if (objA != m45Var) {
                objA = ieiVar;
            }
            if (objA == m45Var) {
                return objA;
            }
        } else {
            Object objN = fd9.N(new z40(new pz7[]{new au5(this, za1Var, tp4Var, i), new au5(this, za1Var, tp4Var, i2)}, tp4Var, i2), xzgVar);
            if (objN == m45Var) {
                return objN;
            }
        }
        return ieiVar;
    }

    public void y(ow owVar) {
        z6d z6dVar = (z6d) ((HashMap) this.F).remove(owVar);
        z6dVar.getClass();
        ds5 ds5Var = (ds5) ((es5) this.H).p.get(z6dVar);
        if (ds5Var != null) {
            synchronized (ds5Var) {
                ds5Var.d--;
            }
        }
    }

    public void z(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!((HashSet) this.F).remove(mediaCodec) || (loudnessCodecController = (LoudnessCodecController) this.H) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    public /* synthetic */ xv8(int i, Object obj) {
        this.E = i;
        this.F = obj;
    }

    public /* synthetic */ xv8(Object obj, Object obj2, Object obj3, int i) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
        this.H = obj3;
    }

    public /* synthetic */ xv8(int i) {
        this.E = i;
    }

    public xv8(Drawable.Callback callback, Map map) {
        this.E = 0;
        if (TextUtils.isEmpty(null)) {
            this.G = null;
            this.H = map;
            if (!(callback instanceof View)) {
                this.F = null;
                return;
            } else {
                this.F = ((View) callback).getContext().getApplicationContext();
                return;
            }
        }
        throw null;
    }

    public xv8(b79 b79Var, Method[] methodArr, Method method) {
        this.E = 24;
        b79Var.getClass();
        this.F = b79Var;
        this.G = methodArr;
        this.H = method;
    }

    public xv8(FirebaseMessagingService firebaseMessagingService, ro6 ro6Var, ExecutorService executorService) {
        this.E = 18;
        this.F = executorService;
        this.G = firebaseMessagingService;
        this.H = ro6Var;
    }

    public xv8() {
        this.E = 26;
        wg6 wg6Var = wg6.G;
        this.F = new HashSet();
        this.G = wg6Var;
    }

    public xv8(Context context) {
        this.E = 23;
        this.F = context.getApplicationContext();
        this.G = k.a;
        this.H = new zw8();
    }

    public xv8(c61 c61Var, a5 a5Var, kr5 kr5Var, Set set) {
        this.E = 19;
        this.F = a5Var;
        this.G = c61Var;
        this.H = kr5Var;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            v(str, 0, str.length(), 1, true, new wg(str, 11, false));
        }
    }

    public xv8(qb5 qb5Var, hab habVar) {
        this.E = 2;
        this.H = qb5Var;
        this.F = habVar;
        this.G = new ArrayList();
    }

    public xv8(w47 w47Var) {
        this.E = 20;
        this.H = w47Var;
        y47 y47Var = (y47) w47Var.e;
        this.F = new u47(w47Var, y47Var.j().n(), -1L, true);
        this.G = new v47(w47Var, y47Var.j().d(), -1L, true);
    }

    public xv8(m51[] m51VarArr) {
        this.E = 15;
        v6g v6gVar = new v6g();
        jeg jegVar = new jeg();
        jegVar.c = 1.0f;
        jegVar.d = 1.0f;
        i51 i51Var = i51.e;
        jegVar.e = i51Var;
        jegVar.f = i51Var;
        jegVar.g = i51Var;
        jegVar.h = i51Var;
        ByteBuffer byteBuffer = m51.a;
        jegVar.k = byteBuffer;
        jegVar.l = byteBuffer;
        jegVar.b = -1;
        m51[] m51VarArr2 = new m51[m51VarArr.length + 2];
        this.F = m51VarArr2;
        System.arraycopy(m51VarArr, 0, m51VarArr2, 0, m51VarArr.length);
        this.G = v6gVar;
        this.H = jegVar;
        m51VarArr2[m51VarArr.length] = v6gVar;
        m51VarArr2[m51VarArr.length + 1] = jegVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public xv8(String str) {
        this.E = 1;
        String strConcat = "ExoPlayer:Loader:".concat(str);
        String str2 = tpi.a;
        this(1, new hee(Executors.newSingleThreadExecutor(new lpi(strConcat)), new rl7(19)));
    }

    public xv8(kq1 kq1Var) {
        this.E = 10;
        this.F = kq1Var;
        int i = Build.VERSION.SDK_INT;
        this.G = i >= 29 ? iq1.b(kq1Var.a) : null;
        this.H = i <= 29 ? new bm4() : null;
    }

    public xv8(e50 e50Var) {
        this.E = 17;
        this.F = e50Var;
        this.G = new gff(zo6.F);
        this.H = new gff(zo6.E);
    }

    public xv8(URL url, k81 k81Var, String str) {
        this.E = 14;
        this.F = url;
        this.H = k81Var;
        this.G = str;
    }

    public xv8(dq9 dq9Var, List list) {
        this.E = 25;
        this.F = dq9Var;
        this.G = list;
        this.H = yqb.b;
    }

    public xv8(g61 g61Var) {
        this.E = 9;
        this.H = g61Var;
        Handler handlerK = tpi.k(null);
        this.F = handlerK;
        f61 f61Var = new f61(this);
        this.G = f61Var;
        g61Var.a.registerStreamEventCallback(new e61(0, handlerK), f61Var);
    }

    public xv8(es5 es5Var, z6d z6dVar) {
        this.E = 16;
        this.H = es5Var;
        this.F = new HashMap();
        this.G = z6dVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, u77] */
    public xv8(v77 v77Var, Context context) {
        this.E = 21;
        this.H = v77Var;
        this.F = new WeakReference(context);
        ?? r0 = new IntConsumer() { // from class: u77
            @Override // java.util.function.IntConsumer
            public final void accept(int i) {
                v77 v77Var2 = (v77) this.a.H;
                if (v77Var2.a0) {
                    return;
                }
                v77Var2.z(1, Integer.valueOf(i), 19);
            }
        };
        this.G = r0;
        context.registerDeviceIdChangeListener(new e61(1, v77Var.v.a(v77Var.t, null)), r0);
    }
}
