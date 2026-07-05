package defpackage;

import com.anthropic.claude.analytics.events.WebViewEvents$WebViewKind;
import com.anthropic.claude.api.chat.MessageBlobFile;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zed {
    public static final Set a = mp0.Z0(new String[]{"xlsx", "xls", "csv"});

    public static final void a(MessageBlobFile messageBlobFile, ej7 ej7Var, zy7 zy7Var, ned nedVar, hdc hdcVar, n3f n3fVar, ld4 ld4Var, int i) {
        int i2;
        ned nedVar2;
        n3f n3fVar2;
        e18 e18Var;
        hdc hdcVar2;
        int i3;
        n3f n3fVar3;
        hdc hdcVar3;
        ned nedVar3;
        messageBlobFile.getClass();
        zy7Var.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-532082932);
        if ((i & 6) == 0) {
            i2 = (e18Var2.f(messageBlobFile) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var2.f(ej7Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var2.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i2 |= 65536;
        }
        if (e18Var2.Q(i2 & 1, (74899 & i2) != 74898)) {
            e18Var2.V();
            int i4 = i & 1;
            lz1 lz1Var = jd4.a;
            if (i4 == 0 || e18Var2.A()) {
                m7f m7fVarN = sq6.n(e18Var2, -1168520582, e18Var2, -1633490746);
                boolean zF = e18Var2.f(null) | e18Var2.f(m7fVarN);
                Object objN = e18Var2.N();
                if (zF || objN == lz1Var) {
                    objN = m7fVarN.a(jce.a.b(ned.class), null, null);
                    e18Var2.k0(objN);
                }
                e18Var2.p(false);
                e18Var2.p(false);
                ned nedVar4 = (ned) objN;
                m7f m7fVarN2 = sq6.n(e18Var2, -1168520582, e18Var2, -1633490746);
                boolean zF2 = e18Var2.f(null) | e18Var2.f(m7fVarN2);
                Object objN2 = e18Var2.N();
                if (zF2 || objN2 == lz1Var) {
                    objN2 = m7fVarN2.a(jce.a.b(hdc.class), null, null);
                    e18Var2.k0(objN2);
                }
                e18Var2.p(false);
                e18Var2.p(false);
                hdc hdcVar4 = (hdc) objN2;
                m7f m7fVarN3 = sq6.n(e18Var2, -1168520582, e18Var2, -1633490746);
                boolean zF3 = e18Var2.f(null) | e18Var2.f(m7fVarN3);
                Object objN3 = e18Var2.N();
                if (zF3 || objN3 == lz1Var) {
                    objN3 = m7fVarN3.a(jce.a.b(n3f.class), null, null);
                    e18Var2.k0(objN3);
                }
                e18Var2.p(false);
                e18Var2.p(false);
                i3 = i2 & (-523265);
                n3fVar3 = (n3f) objN3;
                hdcVar3 = hdcVar4;
                nedVar3 = nedVar4;
            } else {
                e18Var2.T();
                i3 = i2 & (-523265);
                nedVar3 = nedVar;
                hdcVar3 = hdcVar;
                n3fVar3 = n3fVar;
            }
            int i5 = i3;
            e18Var2.q();
            int i6 = i5 & 14;
            int i7 = i5 & 112;
            boolean z = (i6 == 4) | (i7 == 32);
            Object objN4 = e18Var2.N();
            if (z || objN4 == lz1Var) {
                objN4 = nedVar3.a(messageBlobFile, ej7Var);
                e18Var2.k0(objN4);
            }
            String str = (String) objN4;
            Object objN5 = e18Var2.N();
            if (objN5 == lz1Var) {
                objN5 = n3fVar3.a(WebViewEvents$WebViewKind.OFFICE_PREVIEW);
                e18Var2.k0(objN5);
            }
            o3f o3fVar = (o3f) objN5;
            boolean z2 = (i6 == 4) | (i7 == 32);
            Object objN6 = e18Var2.N();
            if (z2 || objN6 == lz1Var) {
                objN6 = mpk.P(Boolean.FALSE);
                e18Var2.k0(objN6);
            }
            int i8 = i6 | 24576;
            int i9 = i5 << 3;
            lwj.i(messageBlobFile, messageBlobFile.getFile_name(), ej7Var, zy7Var, fd9.q0(437237428, new oed(str, messageBlobFile, hdcVar3, o3fVar, (nwb) objN6, 1), e18Var2), e18Var2, i8 | (i9 & 896) | (i9 & 7168));
            e18Var = e18Var2;
            nedVar2 = nedVar3;
            n3fVar2 = n3fVar3;
            hdcVar2 = hdcVar3;
        } else {
            e18Var2.T();
            nedVar2 = nedVar;
            n3fVar2 = n3fVar;
            e18Var = e18Var2;
            hdcVar2 = hdcVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ped(messageBlobFile, ej7Var, zy7Var, nedVar2, hdcVar2, n3fVar2, i, 1);
        }
    }
}
