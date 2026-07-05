package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.StrictMode;
import android.util.TypedValue;
import android.view.View;
import androidx.compose.foundation.layout.b;
import com.anthropic.claude.R;
import com.anthropic.claude.design.icon.a;
import com.pvporbit.freetype.FreeTypeConstants;
import io.sentry.e0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class cmk {
    public static final ta4 a = new ta4(1567387177, false, new sb4(1));
    public static final ta4 b = new ta4(-1471468910, false, new sb4(2));
    public static final ta4 c = new ta4(1353593519, false, new rb4(19));

    public static final void a(int i, ld4 ld4Var, zy7 zy7Var, iqb iqbVar, String str, boolean z) {
        int i2;
        boolean z2;
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1650657793);
        if ((i & 6) == 0) {
            i2 = (e18Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.f(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        int i3 = i2 | 3072;
        if (e18Var.Q(i3 & 1, (i3 & 1171) != 1170)) {
            fqb fqbVar = fqb.E;
            z2 = z;
            ez1.e(zy7Var, b.o(fqbVar, 36.0f), z2, null, null, fd9.q0(2008274467, new lx3(str, z), e18Var), e18Var, ((i3 >> 6) & 14) | 1572864 | ((i3 << 6) & 896), 56);
            iqbVar = fqbVar;
        } else {
            z2 = z;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new mx3(str, zy7Var, iqbVar, z2, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0855  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0877  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:437:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.iqb r67, final defpackage.yih r68, defpackage.bt7 r69, final defpackage.c49 r70, final java.lang.String r71, defpackage.mxc r72, boolean r73, defpackage.pz7 r74, defpackage.pz7 r75, defpackage.pz7 r76, final defpackage.ta4 r77, defpackage.pz7 r78, defpackage.pz7 r79, boolean r80, final defpackage.zy7 r81, final defpackage.zy7 r82, defpackage.zy7 r83, defpackage.zy7 r84, defpackage.ld4 r85, final int r86, final int r87, final int r88) {
        /*
            Method dump skipped, instruction units count: 2198
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmk.b(iqb, yih, bt7, c49, java.lang.String, mxc, boolean, pz7, pz7, pz7, ta4, pz7, pz7, boolean, zy7, zy7, zy7, zy7, ld4, int, int, int):void");
    }

    public static final void c(mxc mxcVar, zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        iqb iqbVar2;
        bpc bpcVarA;
        int i3;
        int i4;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(2057402595);
        if ((i & 6) == 0) {
            i2 = i | (e18Var.d(mxcVar.ordinal()) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.h(zy7Var) ? 32 : 16;
        }
        int i5 = i2 | 384;
        if (e18Var.Q(i5 & 1, (i5 & 147) != 146)) {
            jl3 jl3VarA = gm3.a(e18Var);
            jm3 jm3Var = (jm3) gm3.c(e18Var).e.E;
            int iOrdinal = mxcVar.ordinal();
            if (iOrdinal == 0) {
                e18Var.a0(1478946858);
                bpcVarA = a.a(ud0.j1, e18Var);
                e18Var.p(false);
            } else if (iOrdinal == 1) {
                e18Var.a0(1478948874);
                bpcVarA = a.a(ud0.S, e18Var);
                e18Var.p(false);
            } else {
                if (iOrdinal != 2) {
                    throw ebh.u(e18Var, 1478944794, false);
                }
                e18Var.a0(1478951050);
                bpcVarA = a.a(ud0.E0, e18Var);
                e18Var.p(false);
            }
            int iOrdinal2 = mxcVar.ordinal();
            if (iOrdinal2 == 0) {
                i3 = 1478953737;
                i4 = R.string.ccr_mode_plan;
            } else if (iOrdinal2 == 1) {
                i3 = 1478956200;
                i4 = R.string.ccr_mode_act;
            } else {
                if (iOrdinal2 != 2) {
                    throw ebh.u(e18Var, 1478952284, false);
                }
                i3 = 1478958633;
                i4 = R.string.ccr_mode_auto;
            }
            String strN = vb7.n(e18Var, i3, i4, e18Var, false);
            fqb fqbVar = fqb.E;
            iqb iqbVarM = gb9.M(androidx.compose.foundation.b.c(fqbVar, false, null, null, null, zy7Var, 15), 4.0f, 6.0f, 10.0f, 6.0f);
            cxe cxeVarA = axe.a(new ho0(6.0f, true, new sz6(1)), lja.Q, e18Var, 54);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarM);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, cd4.f, cxeVarA);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            cv8.b(bpcVarA, d4c.j0(R.string.ccr_mode_toggle, e18Var), b.o(fqbVar, 24.0f), jl3VarA.M, e18Var, 392, 0);
            tjh.b(strN, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tkh.b(jm3Var.g, jl3VarA.M, 0L, null, null, null, 0L, null, 0, 0L, null, 0, 16777214), e18Var, 0, 0, 131070);
            e18Var = e18Var;
            e18Var.p(true);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ji(i, 12, iqbVar2, mxcVar, zy7Var);
        }
    }

    public static final void d(int i, ld4 ld4Var) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1582926026);
        if (e18Var.Q(i & 1, i != 0)) {
            Object objN = e18Var.N();
            if (objN == jd4.a) {
                objN = new oob(19);
                e18Var.k0(objN);
            }
            a(438, e18Var, (zy7) objN, null, null, true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new te(i, 28);
        }
    }

    public static final void e(String str, zy7 zy7Var, bz7 bz7Var, ld4 ld4Var, int i) {
        e18 e18Var;
        zy7Var.getClass();
        bz7Var.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-1542427758);
        int i2 = i | (e18Var2.f(str) ? 4 : 2) | (e18Var2.h(bz7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        byte b2 = 0;
        if (e18Var2.Q(i2 & 1, (i2 & 147) != 146)) {
            Object objN = e18Var2.N();
            if (objN == jd4.a) {
                objN = mpk.P(str);
                e18Var2.k0(objN);
            }
            nwb nwbVar = (nwb) objN;
            e18Var = e18Var2;
            ppk.a(zy7Var, fd9.q0(-23383478, new ufe(bz7Var, b2, nwbVar), e18Var2), null, fd9.q0(-563812984, new sxa(zy7Var, 23, b2), e18Var2), null, ysk.c, fd9.q0(773026405, new jj2(16, nwbVar), e18Var2), null, 0L, 0L, 0L, 0L, null, e18Var, 1772598, 0, 16276);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new tfe(zy7Var, str, bz7Var, i, 1);
        }
    }

    public static final void f(final c49 c49Var, final zy7 zy7Var, final zy7 zy7Var2, final zy7 zy7Var3, ld4 ld4Var, final int i) {
        int i2;
        zy7 zy7Var4;
        zy7 zy7Var5;
        zy7 zy7Var6;
        r7e r7eVarS;
        pz7 pz7Var;
        long j;
        long j2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1814174072);
        if ((i & 6) == 0) {
            i2 = (e18Var.d(c49Var.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            zy7Var4 = zy7Var;
            i2 |= e18Var.h(zy7Var4) ? 32 : 16;
        } else {
            zy7Var4 = zy7Var;
        }
        if ((i & 384) == 0) {
            zy7Var5 = zy7Var2;
            i2 |= e18Var.h(zy7Var5) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        } else {
            zy7Var5 = zy7Var2;
        }
        if ((i & 3072) == 0) {
            zy7Var6 = zy7Var3;
            i2 |= e18Var.h(zy7Var6) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        } else {
            zy7Var6 = zy7Var3;
        }
        boolean z = true;
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            c49 c49Var2 = c49.F;
            fqb fqbVar = fqb.E;
            if (c49Var == c49Var2) {
                e18Var.a0(1808861278);
                ez1.e(zy7Var6, b.o(fqbVar, 36.0f), false, null, null, ghk.a, e18Var, ((i2 >> 9) & 14) | 1572912, 60);
                e18Var.p(false);
                r7eVarS = e18Var.s();
                if (r7eVarS != null) {
                    final int i3 = 0;
                    final zy7 zy7Var7 = zy7Var4;
                    final zy7 zy7Var8 = zy7Var5;
                    pz7Var = new pz7() { // from class: kx3
                        @Override // defpackage.pz7
                        public final Object invoke(Object obj, Object obj2) {
                            int i4 = i3;
                            iei ieiVar = iei.a;
                            int i5 = i;
                            switch (i4) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int iP0 = x44.p0(i5 | 1);
                                    cmk.f(c49Var, zy7Var7, zy7Var8, zy7Var3, (ld4) obj, iP0);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int iP02 = x44.p0(i5 | 1);
                                    cmk.f(c49Var, zy7Var7, zy7Var8, zy7Var3, (ld4) obj, iP02);
                                    break;
                            }
                            return ieiVar;
                        }
                    };
                    r7eVarS.d = pz7Var;
                }
                return;
            }
            e18Var.a0(1809195706);
            e18Var.p(false);
            int iOrdinal = c49Var.ordinal();
            boolean z2 = iOrdinal == 4 || iOrdinal == 5;
            int iOrdinal2 = c49Var.ordinal();
            boolean z3 = iOrdinal2 == 3 || iOrdinal2 == 5;
            int iOrdinal3 = c49Var.ordinal();
            if (iOrdinal3 == 0) {
                z = false;
            } else if (iOrdinal3 != 1 && iOrdinal3 != 2 && iOrdinal3 != 3 && iOrdinal3 != 4 && iOrdinal3 != 5) {
                wg6.i();
                return;
            }
            if (z2) {
                e18Var.a0(335482797);
                j = gm3.a(e18Var).s;
                e18Var.p(false);
            } else {
                e18Var.a0(335484149);
                j = gm3.a(e18Var).c;
                e18Var.p(false);
            }
            if (z2) {
                e18Var.a0(335486895);
                j2 = gm3.a(e18Var).M;
                e18Var.p(false);
            } else {
                e18Var.a0(335488306);
                j2 = gm3.a(e18Var).F;
                e18Var.p(false);
            }
            long j3 = j2;
            ez1.d(z2 ? zy7Var2 : zy7Var, b.o(fqbVar, 36.0f), z, null, vz8.E(j, j3, e18Var, 24576), fd9.q0(-1826966680, new p50(z3, j3, z2 ? ud0.u1 : ud0.o, z2 ? vb7.n(e18Var, 335493360, R.string.ccr_stop_button, e18Var, false) : vb7.n(e18Var, 335495216, R.string.ccr_send_button, e18Var, false)), e18Var), e18Var, 1572912, 40);
        } else {
            e18Var.T();
        }
        r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            final int i4 = 1;
            pz7Var = new pz7() { // from class: kx3
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    int i42 = i4;
                    iei ieiVar = iei.a;
                    int i5 = i;
                    switch (i42) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iP0 = x44.p0(i5 | 1);
                            cmk.f(c49Var, zy7Var, zy7Var2, zy7Var3, (ld4) obj, iP0);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iP02 = x44.p0(i5 | 1);
                            cmk.f(c49Var, zy7Var, zy7Var2, zy7Var3, (ld4) obj, iP02);
                            break;
                    }
                    return ieiVar;
                }
            };
            r7eVarS.d = pz7Var;
        }
    }

    public static final int g(jc1 jc1Var) {
        jc1Var.getClass();
        int iOrdinal = jc1Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return 1;
            }
            wg6.i();
        }
        return 0;
    }

    public static final LinkedHashSet h(byte[] bArr) throws IOException {
        bArr.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bArr.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int i = objectInputStream.readInt();
                    for (int i2 = 0; i2 < i; i2++) {
                        Uri uri = Uri.parse(objectInputStream.readUTF());
                        boolean z = objectInputStream.readBoolean();
                        uri.getClass();
                        linkedHashSet.add(new pl4(z, uri));
                    }
                    objectInputStream.close();
                } finally {
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            byteArrayInputStream.close();
            return linkedHashSet;
        } finally {
        }
    }

    public static final Uri i(f6i f6iVar, int i, tb tbVar, String str) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("glance-action");
        builder.path(tbVar.name());
        builder.appendQueryParameter("appWidgetId", String.valueOf(f6iVar.b));
        builder.appendQueryParameter("viewId", String.valueOf(i));
        builder.appendQueryParameter("viewSize", za6.e(f6iVar.j));
        builder.appendQueryParameter("extraData", str);
        if (f6iVar.f) {
            builder.appendQueryParameter("lazyCollection", String.valueOf(f6iVar.k));
            builder.appendQueryParameter("lazeViewItem", String.valueOf(-1));
        }
        return builder.build();
    }

    public static final byte[] j(k1c k1cVar) throws IOException {
        int[] iArrO1;
        int[] iArrO12;
        k1cVar.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i < 28) {
            return new byte[0];
        }
        NetworkRequest networkRequest = (NetworkRequest) k1cVar.a;
        if (networkRequest == null) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                if (i >= 31) {
                    iArrO1 = networkRequest.getTransportTypes();
                    iArrO1.getClass();
                } else {
                    int[] iArr = {2, 0, 3, 6, 10, 9, 8, 4, 1, 5};
                    ArrayList arrayList = new ArrayList();
                    for (int i2 = 0; i2 < 10; i2++) {
                        int i3 = iArr[i2];
                        if (networkRequest.hasTransport(i3)) {
                            arrayList.add(Integer.valueOf(i3));
                        }
                    }
                    iArrO1 = w44.o1(arrayList);
                }
                if (Build.VERSION.SDK_INT >= 31) {
                    iArrO12 = networkRequest.getCapabilities();
                    iArrO12.getClass();
                } else {
                    int[] iArr2 = {17, 5, 2, 10, 29, 19, 3, 32, 7, 4, 12, 36, 23, 0, 33, 20, 11, 13, 18, 21, 15, 35, 34, 8, 1, 25, 14, 16, 6, 9};
                    ArrayList arrayList2 = new ArrayList();
                    for (int i4 = 0; i4 < 30; i4++) {
                        int i5 = iArr2[i4];
                        if (networkRequest.hasCapability(i5)) {
                            arrayList2.add(Integer.valueOf(i5));
                        }
                    }
                    iArrO12 = w44.o1(arrayList2);
                }
                objectOutputStream.writeInt(iArrO1.length);
                for (int i6 : iArrO1) {
                    objectOutputStream.writeInt(i6);
                }
                objectOutputStream.writeInt(iArrO12.length);
                for (int i7 : iArrO12) {
                    objectOutputStream.writeInt(i7);
                }
                objectOutputStream.close();
                byteArrayOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArray.getClass();
                return byteArray;
            } finally {
            }
        } finally {
        }
    }

    public static int k(View view, int i) {
        Context context = view.getContext();
        Context context2 = view.getContext();
        String canonicalName = view.getClass().getCanonicalName();
        TypedValue typedValueG = amk.g(context2, i);
        if (typedValueG != null) {
            int i2 = typedValueG.resourceId;
            return i2 != 0 ? context.getColor(i2) : typedValueG.data;
        }
        e0.g("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", new Object[]{canonicalName, context2.getResources().getResourceName(i)});
        return 0;
    }

    public static final cch l(ja9 ja9Var) {
        ja9Var.getClass();
        String simpleName = null;
        if (!(ja9Var instanceof ga9)) {
            if (ja9Var instanceof fa9) {
                return new cch(((fa9) ja9Var).a, y(ja9Var), null);
            }
            return new cch("", y(ja9Var), null);
        }
        int iY = y(ja9Var);
        ga9 ga9Var = (ga9) ja9Var;
        String str = ga9Var.a;
        Throwable th = ga9Var.c;
        String canonicalName = th != null ? th.getClass().getCanonicalName() : null;
        if (canonicalName != null) {
            simpleName = canonicalName;
        } else if (th != null) {
            simpleName = th.getClass().getSimpleName();
        }
        return new cch(str, iY, simpleName);
    }

    public static final jc1 m(int i) {
        if (i == 0) {
            return jc1.E;
        }
        if (i == 1) {
            return jc1.F;
        }
        sz6.p(grc.u("Could not convert ", i, " to BackoffPolicy"));
        return null;
    }

    public static final t1c n(int i) {
        if (i == 0) {
            return t1c.E;
        }
        if (i == 1) {
            return t1c.F;
        }
        if (i == 2) {
            return t1c.G;
        }
        if (i == 3) {
            return t1c.H;
        }
        if (i == 4) {
            return t1c.I;
        }
        if (Build.VERSION.SDK_INT >= 30 && i == 5) {
            return t1c.J;
        }
        sz6.p(grc.u("Could not convert ", i, " to NetworkType"));
        return null;
    }

    public static final xkc o(int i) {
        if (i == 0) {
            return xkc.E;
        }
        if (i == 1) {
            return xkc.F;
        }
        sz6.p(grc.u("Could not convert ", i, " to OutOfQuotaPolicy"));
        return null;
    }

    public static final zfj p(int i) {
        if (i == 0) {
            return zfj.E;
        }
        if (i == 1) {
            return zfj.F;
        }
        if (i == 2) {
            return zfj.G;
        }
        if (i == 3) {
            return zfj.H;
        }
        if (i == 4) {
            return zfj.I;
        }
        if (i == 5) {
            return zfj.J;
        }
        sz6.p(grc.u("Could not convert ", i, " to State"));
        return null;
    }

    public static final boolean q(nf0 nf0Var) {
        nf0Var.getClass();
        if (nf0Var instanceof lf0) {
            int i = ((lf0) nf0Var).a;
            return i == 408 || i >= 500;
        }
        if (nf0Var instanceof mf0) {
            return r0c.c(((mf0) nf0Var).a);
        }
        wg6.i();
        return false;
    }

    public static final void r(Activity activity, Intent intent) {
        Parcelable parcelableExtra = intent.getParcelableExtra("ACTION_INTENT");
        if (parcelableExtra == null) {
            sz6.p("List adapter activity trampoline invoked without specifying target intent.");
            return;
        }
        Intent intent2 = (Intent) parcelableExtra;
        if (intent.hasExtra("android.widget.extra.CHECKED")) {
            intent2.putExtra("android.widget.extra.CHECKED", intent.getBooleanExtra("android.widget.extra.CHECKED", false));
        }
        String stringExtra = intent.getStringExtra("ACTION_TYPE");
        if (stringExtra == null) {
            sz6.p("List adapter activity trampoline invoked without trampoline type");
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("ACTIVITY_OPTIONS");
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        StrictMode.setVmPolicy(Build.VERSION.SDK_INT >= 31 ? oe0.i(new StrictMode.VmPolicy.Builder(vmPolicy)).build() : new StrictMode.VmPolicy.Builder().build());
        int iOrdinal = tb.valueOf(stringExtra).ordinal();
        if (iOrdinal == 0) {
            activity.startActivity(intent2, bundleExtra);
        } else if (iOrdinal == 1) {
            activity.sendBroadcast(intent2);
        } else if (iOrdinal == 2) {
            activity.startService(intent2);
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                wg6.i();
                return;
            }
            activity.sendBroadcast(intent2);
        } else {
            activity.startForegroundService(intent2);
        }
        StrictMode.setVmPolicy(vmPolicy);
        activity.finish();
    }

    public static int s(float f, int i, int i2) {
        return x54.b(x54.d(i2, Math.round(Color.alpha(i2) * f)), i);
    }

    public static final int t(t1c t1cVar) {
        t1cVar.getClass();
        int iOrdinal = t1cVar.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i = 1;
        if (iOrdinal != 1) {
            i = 2;
            if (iOrdinal != 2) {
                i = 3;
                if (iOrdinal != 3) {
                    i = 4;
                    if (iOrdinal != 4) {
                        if (Build.VERSION.SDK_INT >= 30 && t1cVar == t1c.J) {
                            return 5;
                        }
                        e0.d(t1cVar, " to int", "Could not convert ");
                        return 0;
                    }
                }
            }
        }
        return i;
    }

    public static final int u(xkc xkcVar) {
        xkcVar.getClass();
        int iOrdinal = xkcVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return 1;
            }
            wg6.i();
        }
        return 0;
    }

    public static final byte[] v(Set set) throws IOException {
        set.getClass();
        if (set.isEmpty()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeInt(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    pl4 pl4Var = (pl4) it.next();
                    objectOutputStream.writeUTF(pl4Var.a.toString());
                    objectOutputStream.writeBoolean(pl4Var.b);
                }
                objectOutputStream.close();
                byteArrayOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArray.getClass();
                return byteArray;
            } finally {
            }
        } finally {
        }
    }

    public static final int w(zfj zfjVar) {
        zfjVar.getClass();
        int iOrdinal = zfjVar.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i = 1;
        if (iOrdinal != 1) {
            i = 2;
            if (iOrdinal != 2) {
                i = 3;
                if (iOrdinal != 3) {
                    i = 4;
                    if (iOrdinal != 4) {
                        if (iOrdinal == 5) {
                            return 5;
                        }
                        wg6.i();
                        return 0;
                    }
                }
            }
        }
        return i;
    }

    public static final k1c x(byte[] bArr) throws IOException {
        bArr.getClass();
        if (Build.VERSION.SDK_INT < 28 || bArr.length == 0) {
            return new k1c(null);
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                int i = objectInputStream.readInt();
                int[] iArr = new int[i];
                for (int i2 = 0; i2 < i; i2++) {
                    iArr[i2] = objectInputStream.readInt();
                }
                int i3 = objectInputStream.readInt();
                int[] iArr2 = new int[i3];
                for (int i4 = 0; i4 < i3; i4++) {
                    iArr2[i4] = objectInputStream.readInt();
                }
                k1c k1cVarF = wtk.f(iArr2, iArr);
                objectInputStream.close();
                byteArrayInputStream.close();
                return k1cVarF;
            } finally {
            }
        } finally {
        }
    }

    public static final int y(ja9 ja9Var) {
        ja9Var.getClass();
        if (ja9Var instanceof fa9) {
            return 1;
        }
        if (ja9Var instanceof ga9) {
            return 2;
        }
        if (ja9Var instanceof ea9) {
            return 3;
        }
        if (ja9Var instanceof ia9) {
            return 6;
        }
        if (ja9Var instanceof da9) {
            return 5;
        }
        wg6.i();
        return 0;
    }
}
