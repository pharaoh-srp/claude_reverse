package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.CancellationSignal;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import android.webkit.MimeTypeMap;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.pvporbit.freetype.FreeTypeConstants;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.net.ProtocolException;
import java.security.cert.CertificateException;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gsk {
    public static final ta4 a = new ta4(-2109505927, false, new vb4(19));

    /* JADX WARN: Removed duplicated region for block: B:112:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(com.anthropic.claude.conway.protocol.ConwayExtensionMeta r39, defpackage.iqb r40, defpackage.zy7 r41, defpackage.zy7 r42, defpackage.ld4 r43, int r44, int r45) {
        /*
            Method dump skipped, instruction units count: 1039
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gsk.a(com.anthropic.claude.conway.protocol.ConwayExtensionMeta, iqb, zy7, zy7, ld4, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v31 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r1v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r26v4, types: [ld4] */
    /* JADX WARN: Type inference failed for: r26v5, types: [ld4] */
    /* JADX WARN: Type inference failed for: r26v6, types: [ld4] */
    /* JADX WARN: Type inference failed for: r9v10, types: [e18, ld4] */
    /* JADX WARN: Type inference failed for: r9v12, types: [e18] */
    /* JADX WARN: Type inference failed for: r9v13, types: [e18, ld4] */
    /* JADX WARN: Type inference failed for: r9v15, types: [e18] */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2, types: [e18] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v6, types: [e18] */
    /* JADX WARN: Type inference failed for: r9v7, types: [e18, ld4] */
    /* JADX WARN: Type inference failed for: r9v9, types: [e18] */
    public static final void b(p05 p05Var, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        iqb iqbVar2;
        ?? r9;
        Object y14Var;
        int i3;
        int i4;
        char c;
        Object obj;
        int i5;
        int i6;
        final int i7;
        int i8;
        int i9;
        int i10;
        ?? r92;
        ?? r1;
        Object obj2;
        Object obj3;
        char c2;
        int i11;
        int i12;
        int i13;
        int i14;
        nwb nwbVar;
        final int i15;
        Object y14Var2;
        nwb nwbVar2;
        Object obj4;
        ?? r10;
        ?? r93;
        ?? r94;
        ?? r12;
        ?? r95;
        final p05 p05Var2 = p05Var;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1920543846);
        int i16 = (e18Var.f(p05Var2) ? 4 : 2) | i | 48;
        if (e18Var.Q(i16 & 1, (i16 & 19) != 18)) {
            Context context = (Context) e18Var.j(w00.b);
            Object objN = e18Var.N();
            Object obj5 = jd4.a;
            if (objN == obj5) {
                objN = fd9.O(im6.E, e18Var);
                e18Var.k0(objN);
            }
            l45 l45Var = (l45) objN;
            m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
            boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
            Object objN2 = e18Var.N();
            if (zF || objN2 == obj5) {
                objN2 = m7fVarN.a(jce.a.b(h86.class), null, null);
                e18Var.k0(objN2);
            }
            e18Var.p(false);
            e18Var.p(false);
            h86 h86Var = (h86) objN2;
            Object[] objArr = new Object[0];
            Object objN3 = e18Var.N();
            if (objN3 == obj5) {
                objN3 = new fr4(9);
                e18Var.k0(objN3);
            }
            nwb nwbVar3 = (nwb) iuj.I(objArr, (zy7) objN3, e18Var, 48);
            uc ucVar = new uc();
            int i17 = i16 & 14;
            boolean zH = (i17 == 4) | e18Var.h(l45Var) | e18Var.h(h86Var) | e18Var.h(context);
            Object objN4 = e18Var.N();
            if (zH || objN4 == obj5) {
                objN4 = new fe(l45Var, h86Var, p05Var2, context);
                e18Var.k0(objN4);
            }
            xpa xpaVarD0 = sf5.d0(ucVar, (bz7) objN4, e18Var, 0);
            ud0 ud0Var = ud0.X;
            String strJ0 = d4c.j0(R.string.conway_system_extensions_title, e18Var);
            String strJ02 = d4c.j0(R.string.conway_system_extensions_desc, e18Var);
            ta4 ta4VarQ0 = fd9.q0(-112943208, new ii(p05Var2, 26, xpaVarD0), e18Var);
            p05Var2 = p05Var;
            ta4 ta4VarQ02 = fd9.q0(-756104978, new bn(20, nwbVar3, p05Var, l45Var, context), e18Var);
            fqb fqbVar = fqb.E;
            int i18 = i17;
            i2 = 17;
            char c3 = 18;
            int i19 = 4;
            zsk.c(ud0Var, strJ0, strJ02, fqbVar, ta4VarQ0, MTTypesetterKt.kLineSkipLimitMultiplier, ta4VarQ02, e18Var, 1600512, 32);
            e18 e18Var2 = e18Var;
            final ewc ewcVar = (ewc) p05Var2.j.getValue();
            if (ewcVar == null) {
                e18Var2.a0(1666664600);
                e18Var2.p(false);
                obj = obj5;
                r1 = 0;
                i10 = 1;
                i9 = 2;
                r92 = e18Var2;
            } else {
                e18Var2.a0(1666664601);
                boolean z = i18 == 4;
                Object objN5 = e18Var2.N();
                if (z || objN5 == obj5) {
                    i3 = 1;
                    i4 = 17;
                    c = 18;
                    obj = obj5;
                    i5 = 4;
                    i6 = i18;
                    i7 = 0;
                    i8 = 2;
                    y14Var = new y14(0, p05Var2, p05.class, "dismissInstall", "dismissInstall()V", 0, 14);
                    e18Var2.k0(y14Var);
                } else {
                    i6 = i18;
                    y14Var = objN5;
                    obj = obj5;
                    i3 = 1;
                    i4 = 17;
                    c = 18;
                    i5 = 4;
                    i7 = 0;
                    i8 = 2;
                }
                i19 = i5;
                i18 = i6;
                i9 = i8;
                c3 = c;
                ?? r13 = i7;
                i10 = i3;
                i2 = i4;
                ppk.a((zy7) ((jm9) y14Var), fd9.q0(1891313676, new pz7() { // from class: pv4
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.pz7
                    public final Object invoke(Object obj6, Object obj7) {
                        int i20 = i7;
                        iei ieiVar = iei.a;
                        lz1 lz1Var = jd4.a;
                        final ewc ewcVar2 = ewcVar;
                        final p05 p05Var3 = p05Var2;
                        Object[] objArr2 = 0;
                        final int i21 = 1;
                        switch (i20) {
                            case 0:
                                ld4 ld4Var2 = (ld4) obj6;
                                int iIntValue = ((Integer) obj7).intValue();
                                e18 e18Var3 = (e18) ld4Var2;
                                if (!e18Var3.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    e18Var3.T();
                                } else {
                                    boolean zF2 = e18Var3.f(p05Var3) | e18Var3.h(ewcVar2);
                                    Object objN6 = e18Var3.N();
                                    if (zF2 || objN6 == lz1Var) {
                                        objN6 = new zy7() { // from class: tv4
                                            @Override // defpackage.zy7
                                            public final Object a() {
                                                int i22 = i21;
                                                iei ieiVar2 = iei.a;
                                                ewc ewcVar3 = ewcVar2;
                                                p05 p05Var4 = p05Var3;
                                                switch (i22) {
                                                    case 0:
                                                        p05Var4.P(ewcVar3);
                                                        break;
                                                    default:
                                                        p05Var4.P(ewcVar3);
                                                        break;
                                                }
                                                return ieiVar2;
                                            }
                                        };
                                        e18Var3.k0(objN6);
                                    }
                                    csg.j((zy7) objN6, null, false, null, null, null, null, gjk.a, e18Var3, 805306368, 510);
                                }
                                break;
                            default:
                                ld4 ld4Var3 = (ld4) obj6;
                                int iIntValue2 = ((Integer) obj7).intValue();
                                e18 e18Var4 = (e18) ld4Var3;
                                if (!e18Var4.Q(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                                    e18Var4.T();
                                } else {
                                    boolean zF3 = e18Var4.f(p05Var3) | e18Var4.h(ewcVar2);
                                    Object objN7 = e18Var4.N();
                                    if (zF3 || objN7 == lz1Var) {
                                        final Object[] objArr3 = objArr2 == true ? 1 : 0;
                                        objN7 = new zy7() { // from class: tv4
                                            @Override // defpackage.zy7
                                            public final Object a() {
                                                int i22 = objArr3;
                                                iei ieiVar2 = iei.a;
                                                ewc ewcVar3 = ewcVar2;
                                                p05 p05Var4 = p05Var3;
                                                switch (i22) {
                                                    case 0:
                                                        p05Var4.P(ewcVar3);
                                                        break;
                                                    default:
                                                        p05Var4.P(ewcVar3);
                                                        break;
                                                }
                                                return ieiVar2;
                                            }
                                        };
                                        e18Var4.k0(objN7);
                                    }
                                    csg.j((zy7) objN7, null, false, null, null, null, null, gjk.d, e18Var4, 805306368, 510);
                                }
                                break;
                        }
                        return ieiVar;
                    }
                }, e18Var2), null, fd9.q0(-1316694070, new qv4(p05Var2, i7), e18Var2), null, gjk.c, fd9.q0(-1833738393, new pz7() { // from class: rv4
                    @Override // defpackage.pz7
                    public final Object invoke(Object obj6, Object obj7) {
                        int i20 = i7;
                        iei ieiVar = iei.a;
                        ewc ewcVar2 = ewcVar;
                        switch (i20) {
                            case 0:
                                ld4 ld4Var2 = (ld4) obj6;
                                int iIntValue = ((Integer) obj7).intValue();
                                e18 e18Var3 = (e18) ld4Var2;
                                if (!e18Var3.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    e18Var3.T();
                                } else {
                                    tjh.b(d4c.k0(R.string.conway_ext_trust_body, new Object[]{ewcVar2.a}, e18Var3), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var3, 0, 0, 262142);
                                }
                                break;
                            default:
                                ld4 ld4Var3 = (ld4) obj6;
                                int iIntValue2 = ((Integer) obj7).intValue();
                                e18 e18Var4 = (e18) ld4Var3;
                                if (!e18Var4.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    e18Var4.T();
                                } else {
                                    tjh.b(d4c.k0(R.string.conway_ext_overwrite_body, new Object[]{ewcVar2.a}, e18Var4), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var4, 0, 0, 262142);
                                }
                                break;
                        }
                        return ieiVar;
                    }
                }, e18Var2), null, 0L, 0L, 0L, 0L, null, e18Var2, 1772592, 0, 16276);
                ?? r96 = e18Var2;
                r96.p(r13);
                r1 = r13;
                r92 = r96;
            }
            final ewc ewcVar2 = (ewc) p05Var2.k.getValue();
            if (ewcVar2 == null) {
                r92.a0(1667363650);
                r92.p(r1);
                r10 = r1;
                obj4 = obj;
                nwbVar2 = nwbVar3;
                r93 = r92;
            } else {
                r92.a0(1667363651);
                ?? r11 = i18 == i19 ? i10 : r1;
                Object objN6 = r92.N();
                if (r11 == 0) {
                    obj2 = obj;
                    if (objN6 != obj2) {
                        i14 = i18;
                        i13 = i9;
                        i11 = i2;
                        c2 = c3;
                        i12 = i19;
                        obj3 = obj2;
                        y14Var2 = objN6;
                        nwbVar = nwbVar3;
                        i15 = i10;
                    }
                    i10 = i15;
                    nwbVar2 = nwbVar;
                    i9 = i13;
                    i19 = i12;
                    i2 = i11;
                    ?? r26 = r92;
                    i18 = i14;
                    obj4 = obj3;
                    ppk.a((zy7) ((jm9) y14Var2), fd9.q0(-620445949, new pz7() { // from class: pv4
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.pz7
                        public final Object invoke(Object obj6, Object obj7) {
                            int i20 = i15;
                            iei ieiVar = iei.a;
                            lz1 lz1Var = jd4.a;
                            final ewc ewcVar22 = ewcVar2;
                            final p05 p05Var3 = p05Var2;
                            Object[] objArr2 = 0;
                            final int i21 = 1;
                            switch (i20) {
                                case 0:
                                    ld4 ld4Var2 = (ld4) obj6;
                                    int iIntValue = ((Integer) obj7).intValue();
                                    e18 e18Var3 = (e18) ld4Var2;
                                    if (!e18Var3.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        e18Var3.T();
                                    } else {
                                        boolean zF2 = e18Var3.f(p05Var3) | e18Var3.h(ewcVar22);
                                        Object objN62 = e18Var3.N();
                                        if (zF2 || objN62 == lz1Var) {
                                            objN62 = new zy7() { // from class: tv4
                                                @Override // defpackage.zy7
                                                public final Object a() {
                                                    int i22 = i21;
                                                    iei ieiVar2 = iei.a;
                                                    ewc ewcVar3 = ewcVar22;
                                                    p05 p05Var4 = p05Var3;
                                                    switch (i22) {
                                                        case 0:
                                                            p05Var4.P(ewcVar3);
                                                            break;
                                                        default:
                                                            p05Var4.P(ewcVar3);
                                                            break;
                                                    }
                                                    return ieiVar2;
                                                }
                                            };
                                            e18Var3.k0(objN62);
                                        }
                                        csg.j((zy7) objN62, null, false, null, null, null, null, gjk.a, e18Var3, 805306368, 510);
                                    }
                                    break;
                                default:
                                    ld4 ld4Var3 = (ld4) obj6;
                                    int iIntValue2 = ((Integer) obj7).intValue();
                                    e18 e18Var4 = (e18) ld4Var3;
                                    if (!e18Var4.Q(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                                        e18Var4.T();
                                    } else {
                                        boolean zF3 = e18Var4.f(p05Var3) | e18Var4.h(ewcVar22);
                                        Object objN7 = e18Var4.N();
                                        if (zF3 || objN7 == lz1Var) {
                                            final int objArr3 = objArr2 == true ? 1 : 0;
                                            objN7 = new zy7() { // from class: tv4
                                                @Override // defpackage.zy7
                                                public final Object a() {
                                                    int i22 = objArr3;
                                                    iei ieiVar2 = iei.a;
                                                    ewc ewcVar3 = ewcVar22;
                                                    p05 p05Var4 = p05Var3;
                                                    switch (i22) {
                                                        case 0:
                                                            p05Var4.P(ewcVar3);
                                                            break;
                                                        default:
                                                            p05Var4.P(ewcVar3);
                                                            break;
                                                    }
                                                    return ieiVar2;
                                                }
                                            };
                                            e18Var4.k0(objN7);
                                        }
                                        csg.j((zy7) objN7, null, false, null, null, null, null, gjk.d, e18Var4, 805306368, 510);
                                    }
                                    break;
                            }
                            return ieiVar;
                        }
                    }, r92), null, fd9.q0(270628673, new qv4(p05Var2, i15), r92), null, gjk.f, fd9.q0(1607240606, new pz7() { // from class: rv4
                        @Override // defpackage.pz7
                        public final Object invoke(Object obj6, Object obj7) {
                            int i20 = i15;
                            iei ieiVar = iei.a;
                            ewc ewcVar22 = ewcVar2;
                            switch (i20) {
                                case 0:
                                    ld4 ld4Var2 = (ld4) obj6;
                                    int iIntValue = ((Integer) obj7).intValue();
                                    e18 e18Var3 = (e18) ld4Var2;
                                    if (!e18Var3.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        e18Var3.T();
                                    } else {
                                        tjh.b(d4c.k0(R.string.conway_ext_trust_body, new Object[]{ewcVar22.a}, e18Var3), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var3, 0, 0, 262142);
                                    }
                                    break;
                                default:
                                    ld4 ld4Var3 = (ld4) obj6;
                                    int iIntValue2 = ((Integer) obj7).intValue();
                                    e18 e18Var4 = (e18) ld4Var3;
                                    if (!e18Var4.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        e18Var4.T();
                                    } else {
                                        tjh.b(d4c.k0(R.string.conway_ext_overwrite_body, new Object[]{ewcVar22.a}, e18Var4), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var4, 0, 0, 262142);
                                    }
                                    break;
                            }
                            return ieiVar;
                        }
                    }, r92), null, 0L, 0L, 0L, 0L, null, r26, 1772592, 0, 16276);
                    ?? r97 = r26;
                    r10 = 0;
                    r97.p(false);
                    r93 = r97;
                } else {
                    obj2 = obj;
                }
                obj3 = obj2;
                i14 = i18;
                i15 = i10;
                nwbVar = nwbVar3;
                i12 = i19;
                i13 = i9;
                i11 = i2;
                c2 = c3;
                y14Var2 = new y14(0, p05Var2, p05.class, "dismissOverwrite", "dismissOverwrite()V", 0, 16);
                r92.k0(y14Var2);
                i10 = i15;
                nwbVar2 = nwbVar;
                i9 = i13;
                i19 = i12;
                i2 = i11;
                ?? r262 = r92;
                i18 = i14;
                obj4 = obj3;
                ppk.a((zy7) ((jm9) y14Var2), fd9.q0(-620445949, new pz7() { // from class: pv4
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.pz7
                    public final Object invoke(Object obj6, Object obj7) {
                        int i20 = i15;
                        iei ieiVar = iei.a;
                        lz1 lz1Var = jd4.a;
                        final ewc ewcVar22 = ewcVar2;
                        final p05 p05Var3 = p05Var2;
                        Object[] objArr2 = 0;
                        final int i21 = 1;
                        switch (i20) {
                            case 0:
                                ld4 ld4Var2 = (ld4) obj6;
                                int iIntValue = ((Integer) obj7).intValue();
                                e18 e18Var3 = (e18) ld4Var2;
                                if (!e18Var3.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    e18Var3.T();
                                } else {
                                    boolean zF2 = e18Var3.f(p05Var3) | e18Var3.h(ewcVar22);
                                    Object objN62 = e18Var3.N();
                                    if (zF2 || objN62 == lz1Var) {
                                        objN62 = new zy7() { // from class: tv4
                                            @Override // defpackage.zy7
                                            public final Object a() {
                                                int i22 = i21;
                                                iei ieiVar2 = iei.a;
                                                ewc ewcVar3 = ewcVar22;
                                                p05 p05Var4 = p05Var3;
                                                switch (i22) {
                                                    case 0:
                                                        p05Var4.P(ewcVar3);
                                                        break;
                                                    default:
                                                        p05Var4.P(ewcVar3);
                                                        break;
                                                }
                                                return ieiVar2;
                                            }
                                        };
                                        e18Var3.k0(objN62);
                                    }
                                    csg.j((zy7) objN62, null, false, null, null, null, null, gjk.a, e18Var3, 805306368, 510);
                                }
                                break;
                            default:
                                ld4 ld4Var3 = (ld4) obj6;
                                int iIntValue2 = ((Integer) obj7).intValue();
                                e18 e18Var4 = (e18) ld4Var3;
                                if (!e18Var4.Q(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                                    e18Var4.T();
                                } else {
                                    boolean zF3 = e18Var4.f(p05Var3) | e18Var4.h(ewcVar22);
                                    Object objN7 = e18Var4.N();
                                    if (zF3 || objN7 == lz1Var) {
                                        final int objArr3 = objArr2 == true ? 1 : 0;
                                        objN7 = new zy7() { // from class: tv4
                                            @Override // defpackage.zy7
                                            public final Object a() {
                                                int i22 = objArr3;
                                                iei ieiVar2 = iei.a;
                                                ewc ewcVar3 = ewcVar22;
                                                p05 p05Var4 = p05Var3;
                                                switch (i22) {
                                                    case 0:
                                                        p05Var4.P(ewcVar3);
                                                        break;
                                                    default:
                                                        p05Var4.P(ewcVar3);
                                                        break;
                                                }
                                                return ieiVar2;
                                            }
                                        };
                                        e18Var4.k0(objN7);
                                    }
                                    csg.j((zy7) objN7, null, false, null, null, null, null, gjk.d, e18Var4, 805306368, 510);
                                }
                                break;
                        }
                        return ieiVar;
                    }
                }, r92), null, fd9.q0(270628673, new qv4(p05Var2, i15), r92), null, gjk.f, fd9.q0(1607240606, new pz7() { // from class: rv4
                    @Override // defpackage.pz7
                    public final Object invoke(Object obj6, Object obj7) {
                        int i20 = i15;
                        iei ieiVar = iei.a;
                        ewc ewcVar22 = ewcVar2;
                        switch (i20) {
                            case 0:
                                ld4 ld4Var2 = (ld4) obj6;
                                int iIntValue = ((Integer) obj7).intValue();
                                e18 e18Var3 = (e18) ld4Var2;
                                if (!e18Var3.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    e18Var3.T();
                                } else {
                                    tjh.b(d4c.k0(R.string.conway_ext_trust_body, new Object[]{ewcVar22.a}, e18Var3), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var3, 0, 0, 262142);
                                }
                                break;
                            default:
                                ld4 ld4Var3 = (ld4) obj6;
                                int iIntValue2 = ((Integer) obj7).intValue();
                                e18 e18Var4 = (e18) ld4Var3;
                                if (!e18Var4.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    e18Var4.T();
                                } else {
                                    tjh.b(d4c.k0(R.string.conway_ext_overwrite_body, new Object[]{ewcVar22.a}, e18Var4), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var4, 0, 0, 262142);
                                }
                                break;
                        }
                        return ieiVar;
                    }
                }, r92), null, 0L, 0L, 0L, 0L, null, r262, 1772592, 0, 16276);
                ?? r972 = r262;
                r10 = 0;
                r972.p(false);
                r93 = r972;
            }
            String str = (String) nwbVar2.getValue();
            if (str == null) {
                r93.a0(1668045371);
                r93.p(r10);
                r12 = r10;
                r94 = r93;
            } else {
                r93.a0(1668045372);
                boolean zF2 = r93.f(nwbVar2);
                Object objN7 = r93.N();
                if (zF2 || objN7 == obj4) {
                    objN7 = new vi4(16, nwbVar2);
                    r93.k0(objN7);
                }
                ?? r263 = r93;
                ?? r14 = r10;
                ppk.a((zy7) objN7, fd9.q0(-261085912, new f44(11, p05Var2, nwbVar2, str), r93), null, fd9.q0(-1574915798, new jj2(5, nwbVar2), r93), null, gjk.i, fd9.q0(-1398176979, new rq(str, i2), r93), null, 0L, 0L, 0L, 0L, null, r263, 1772592, 0, 16276);
                ?? r98 = r263;
                r98.p(r14);
                r12 = r14;
                r94 = r98;
            }
            String str2 = (String) p05Var2.l.getValue();
            if (str2 == null) {
                r94.a0(1668760820);
                r94.p(r12);
                r95 = r94;
            } else {
                r94.a0(1668760821);
                ?? r112 = i18 == i19 ? i10 : r12;
                Object objN8 = r94.N();
                if (r112 != 0 || objN8 == obj4) {
                    objN8 = new sv4(p05Var2, i10);
                    r94.k0(objN8);
                }
                ?? r264 = r94;
                ppk.a((zy7) objN8, fd9.q0(-226261975, new qv4(p05Var2, i9), r94), null, null, null, gjk.k, fd9.q0(-1363353042, new rq(str2, 18), r94), null, 0L, 0L, 0L, 0L, null, r264, 1769520, 0, 16284);
                ?? r99 = r264;
                r99.p(r12);
                r95 = r99;
            }
            iqbVar2 = fqbVar;
            r9 = r95;
        } else {
            e18 e18Var3 = e18Var;
            i2 = 17;
            e18Var3.T();
            iqbVar2 = iqbVar;
            r9 = e18Var3;
        }
        r7e r7eVarS = r9.s();
        if (r7eVarS != null) {
            r7eVarS.d = new t04(p05Var2, iqbVar2, i, i2);
        }
    }

    public static final String c(Throwable th) {
        th.getClass();
        StringWriter stringWriter = new StringWriter(FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING);
        PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String string = stringWriter.toString();
        string.getClass();
        return string;
    }

    public static sk8 d(String str) {
        str.getClass();
        return (sk8) ((Map) sk8.i.getValue()).get(str);
    }

    public static String e(String str) {
        if (bsg.I0(str)) {
            return null;
        }
        String strI1 = bsg.i1('#', str, str);
        String strI12 = bsg.i1('?', strI1, strI1);
        String strD1 = bsg.d1('.', bsg.d1('/', strI12, strI12), "");
        if (bsg.I0(strD1)) {
            return null;
        }
        String lowerCase = strD1.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        String str2 = (String) hkb.a.get(lowerCase);
        return str2 == null ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase) : str2;
    }

    public static List f() {
        return (List) sk8.h.getValue();
    }

    public static void g(p60 p60Var, HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        int i;
        yjh yjhVarC;
        int i2;
        int iE = 2;
        if (Build.VERSION.SDK_INT >= 34) {
            i5i i5iVar = (i5i) p60Var.G;
            akh akhVar = (akh) p60Var.M;
            zy7 zy7Var = (zy7) p60Var.N;
            ovi oviVar = (ovi) p60Var.O;
            if (fa5.z(handwritingGesture)) {
                SelectGesture selectGestureS = fa5.s(handwritingGesture);
                long jP = zrk.p(akhVar, mwa.T(selectGestureS.getSelectionArea()), selectGestureS.getGranularity() == 1 ? 1 : 0);
                if (kkh.d(jP)) {
                    iE = yrk.e(i5iVar, df8.q(selectGestureS));
                } else {
                    i5iVar.j(jP);
                    if (zy7Var != null) {
                        zy7Var.a();
                    }
                    iE = 1;
                }
            } else if (df8.x(handwritingGesture)) {
                DeleteGesture deleteGestureO = df8.o(handwritingGesture);
                i2 = deleteGestureO.getGranularity() == 1 ? 1 : 0;
                long jP2 = zrk.p(akhVar, mwa.T(deleteGestureO.getDeletionArea()), i2);
                if (kkh.d(jP2)) {
                    iE = yrk.e(i5iVar, df8.q(deleteGestureO));
                } else {
                    if (i2 == 1) {
                        jP2 = zrk.b(jP2, i5iVar.d());
                    }
                    i5i.i(i5iVar, "", jP2, false, 12);
                    iE = 1;
                }
            } else if (df8.C(handwritingGesture)) {
                SelectRangeGesture selectRangeGestureS = df8.s(handwritingGesture);
                long jE = zrk.e(akhVar, mwa.T(selectRangeGestureS.getSelectionStartArea()), mwa.T(selectRangeGestureS.getSelectionEndArea()), selectRangeGestureS.getGranularity() == 1 ? 1 : 0);
                if (kkh.d(jE)) {
                    iE = yrk.e(i5iVar, df8.q(selectRangeGestureS));
                } else {
                    i5iVar.j(jE);
                    if (zy7Var != null) {
                        zy7Var.a();
                    }
                    iE = 1;
                }
            } else if (df8.D(handwritingGesture)) {
                DeleteRangeGesture deleteRangeGestureP = df8.p(handwritingGesture);
                i2 = deleteRangeGestureP.getGranularity() == 1 ? 1 : 0;
                long jE2 = zrk.e(akhVar, mwa.T(deleteRangeGestureP.getDeletionStartArea()), mwa.T(deleteRangeGestureP.getDeletionEndArea()), i2);
                if (kkh.d(jE2)) {
                    iE = yrk.e(i5iVar, df8.q(deleteRangeGestureP));
                } else {
                    if (i2 == 1) {
                        jE2 = zrk.b(jE2, i5iVar.d());
                    }
                    i5i.i(i5iVar, "", jE2, false, 12);
                    iE = 1;
                }
            } else if (fa5.D(handwritingGesture)) {
                JoinOrSplitGesture joinOrSplitGestureR = df8.r(handwritingGesture);
                if (i5iVar.a.d() != i5iVar.a.d()) {
                    iE = 3;
                } else {
                    long jH = zrk.h(joinOrSplitGestureR.getJoinOrSplitPoint());
                    yjh yjhVarC2 = akhVar.c();
                    int iN = yjhVarC2 != null ? zrk.n(yjhVarC2.b, jH, akhVar.e(), oviVar) : -1;
                    if (iN == -1 || ((yjhVarC = akhVar.c()) != null && zrk.f(yjhVarC, iN))) {
                        iE = yrk.e(i5iVar, df8.q(joinOrSplitGestureR));
                    } else {
                        long jG = zrk.g(iN, i5iVar.d());
                        if (kkh.d(jG)) {
                            i5i.i(i5iVar, " ", jG, false, 12);
                        } else {
                            i5i.i(i5iVar, "", jG, false, 12);
                        }
                        iE = 1;
                    }
                }
            } else if (fa5.B(handwritingGesture)) {
                InsertGesture insertGestureQ = fa5.q(handwritingGesture);
                long jH2 = zrk.h(insertGestureQ.getInsertionPoint());
                yjh yjhVarC3 = akhVar.c();
                int iN2 = yjhVarC3 != null ? zrk.n(yjhVarC3.b, jH2, akhVar.e(), oviVar) : -1;
                if (iN2 == -1) {
                    iE = yrk.e(i5iVar, df8.q(insertGestureQ));
                } else {
                    i5i.i(i5iVar, insertGestureQ.getTextToInsert(), mwa.m(iN2, iN2), false, 12);
                    iE = 1;
                }
            } else if (fa5.C(handwritingGesture)) {
                RemoveSpaceGesture removeSpaceGestureR = fa5.r(handwritingGesture);
                long jC = zrk.c(akhVar.c(), zrk.h(removeSpaceGestureR.getStartPoint()), zrk.h(removeSpaceGestureR.getEndPoint()), akhVar.e(), oviVar);
                if (kkh.d(jC)) {
                    iE = yrk.e(i5iVar, df8.q(removeSpaceGestureR));
                } else {
                    bae baeVar = new bae();
                    baeVar.E = -1;
                    bae baeVar2 = new bae();
                    baeVar2.E = -1;
                    String strG = new ide("\\s+").g(mwa.O(jC, i5iVar.d()), new ef8(baeVar, baeVar2, 1));
                    int i3 = baeVar.E;
                    if (i3 == -1 || (i = baeVar2.E) == -1) {
                        iE = yrk.e(i5iVar, df8.q(removeSpaceGestureR));
                    } else {
                        int i4 = (int) (jC >> 32);
                        i5i.i(i5iVar, strG.substring(baeVar.E, strG.length() - (kkh.e(jC) - baeVar2.E)), mwa.m(i3 + i4, i4 + i), false, 12);
                        iE = 1;
                    }
                }
            }
        }
        if (intConsumer == null) {
            return;
        }
        if (executor != null) {
            executor.execute(new qe0(intConsumer, iE, 1));
        } else {
            intConsumer.accept(iE);
        }
    }

    public static boolean h(p60 p60Var, PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        if (Build.VERSION.SDK_INT >= 34) {
            i5i i5iVar = (i5i) p60Var.G;
            akh akhVar = (akh) p60Var.M;
            if (fa5.z(previewableHandwritingGesture)) {
                SelectGesture selectGestureS = fa5.s(previewableHandwritingGesture);
                yrk.h(i5iVar, zrk.p(akhVar, mwa.T(selectGestureS.getSelectionArea()), selectGestureS.getGranularity() != 1 ? 0 : 1), 0);
            } else if (df8.x(previewableHandwritingGesture)) {
                DeleteGesture deleteGestureO = df8.o(previewableHandwritingGesture);
                yrk.h(i5iVar, zrk.p(akhVar, mwa.T(deleteGestureO.getDeletionArea()), deleteGestureO.getGranularity() == 1 ? 1 : 0), 1);
            } else if (df8.C(previewableHandwritingGesture)) {
                SelectRangeGesture selectRangeGestureS = df8.s(previewableHandwritingGesture);
                yrk.h(i5iVar, zrk.e(akhVar, mwa.T(selectRangeGestureS.getSelectionStartArea()), mwa.T(selectRangeGestureS.getSelectionEndArea()), selectRangeGestureS.getGranularity() != 1 ? 0 : 1), 0);
            } else if (df8.D(previewableHandwritingGesture)) {
                DeleteRangeGesture deleteRangeGestureP = df8.p(previewableHandwritingGesture);
                yrk.h(i5iVar, zrk.e(akhVar, mwa.T(deleteRangeGestureP.getDeletionStartArea()), mwa.T(deleteRangeGestureP.getDeletionEndArea()), deleteRangeGestureP.getGranularity() == 1 ? 1 : 0), 1);
            }
            if (cancellationSignal != null) {
                cancellationSignal.setOnCancelListener(new zc4(2, i5iVar));
            }
            return true;
        }
        return false;
    }

    public static final boolean i(IOException iOException) {
        if ((iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException)) {
            return false;
        }
        return (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException) || !(iOException instanceof SSLException)) ? false : true;
    }

    public static String j(suk sukVar) {
        StringBuilder sb = new StringBuilder(sukVar.h());
        for (int i = 0; i < sukVar.h(); i++) {
            byte bA = sukVar.a(i);
            if (bA == 34) {
                sb.append("\\\"");
            } else if (bA == 39) {
                sb.append("\\'");
            } else if (bA != 92) {
                switch (bA) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bA < 32 || bA > 126) {
                            sb.append('\\');
                            sb.append((char) (((bA >>> 6) & 3) + 48));
                            sb.append((char) (((bA >>> 3) & 7) + 48));
                            sb.append((char) ((bA & 7) + 48));
                        } else {
                            sb.append((char) bA);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
