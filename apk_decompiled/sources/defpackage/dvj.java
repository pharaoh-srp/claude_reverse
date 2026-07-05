package defpackage;

import androidx.compose.runtime.b;
import com.anthropic.claude.project.details.custominstructions.d;
import com.anthropic.claude.tool.model.EventSearchV0Output;
import com.anthropic.claude.tool.model.EventSearchV0OutputEventSearchError;
import com.anthropic.claude.tool.model.EventSearchV0OutputEventSearchResult;
import com.pvporbit.freetype.FreeTypeConstants;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/* JADX INFO: loaded from: classes3.dex */
public abstract class dvj {
    public static final ta4 a = new ta4(-605616087, false, new xa4(0));
    public static final StackTraceElement[] b = new StackTraceElement[0];

    public static final void a(String str, zy7 zy7Var, bz7 bz7Var, d dVar, qi3 qi3Var, ld4 ld4Var, int i) {
        e18 e18Var;
        qi3 qi3Var2;
        int i2;
        qi3 qi3Var3;
        str.getClass();
        zy7Var.getClass();
        bz7Var.getClass();
        dVar.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-1986003658);
        int i3 = i | (e18Var2.f(str) ? 4 : 2) | (e18Var2.h(zy7Var) ? 32 : 16) | (e18Var2.h(bz7Var) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var2.f(dVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        if (e18Var2.Q(i3 & 1, (i3 & 9363) != 9362)) {
            e18Var2.V();
            int i4 = i & 1;
            tp4 tp4Var = null;
            lz1 lz1Var = jd4.a;
            if (i4 == 0 || e18Var2.A()) {
                m7f m7fVarN = sq6.n(e18Var2, -1168520582, e18Var2, -1633490746);
                boolean zF = e18Var2.f(null) | e18Var2.f(m7fVarN);
                Object objN = e18Var2.N();
                if (zF || objN == lz1Var) {
                    objN = m7fVarN.a(jce.a.b(qi3.class), null, null);
                    e18Var2.k0(objN);
                }
                e18Var2.p(false);
                e18Var2.p(false);
                i2 = i3 & (-57345);
                qi3Var3 = (qi3) objN;
            } else {
                e18Var2.T();
                i2 = i3 & (-57345);
                qi3Var3 = qi3Var;
            }
            e18Var2.q();
            boolean zH = e18Var2.h(qi3Var3);
            Object objN2 = e18Var2.N();
            if (zH || objN2 == lz1Var) {
                objN2 = new gw(qi3Var3, tp4Var, 13);
                e18Var2.k0(objN2);
            }
            csg.g((bz7) objN2, e18Var2, 0, 1);
            zy1 zy1Var = dVar.f;
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objN3 = e18Var2.N();
            int i5 = 14;
            if (z || objN3 == lz1Var) {
                objN3 = new zn(zy7Var, bz7Var, tp4Var, i5);
                e18Var2.k0(objN3);
            }
            x44.b(zy1Var, (pz7) objN3, e18Var2, 0);
            e18Var = e18Var2;
            trk.b(zy7Var, fd9.q0(-428315559, new mk4(i5, dVar), e18Var2), null, fd9.q0(-1544283685, new um5(dVar, 10, zy7Var), e18Var2), dlk.c, fd9.q0(1076731422, new um5(str, 11, dVar), e18Var2), null, 0L, 0L, 0L, 0L, null, e18Var, ((i2 >> 3) & 14) | 1772592, 0, 16276);
            qi3Var2 = qi3Var3;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            qi3Var2 = qi3Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new uo(str, zy7Var, bz7Var, dVar, qi3Var2, i);
        }
    }

    public static final void b(v77 v77Var, iqb iqbVar, int i, ld4 ld4Var, int i2) {
        int i3;
        int i4;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(12998269);
        if ((i2 & 6) == 0) {
            i3 = i2 | (e18Var.h(v77Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        int i5 = 16;
        if ((i2 & 48) == 0) {
            i3 |= e18Var.f(iqbVar) ? 32 : 16;
        }
        int i6 = i3 | 384;
        if ((i6 & 147) == 146 && e18Var.C()) {
            e18Var.T();
            i4 = i;
        } else {
            e18Var.a0(-1232449568);
            e18Var.a0(-316851119);
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = mpk.P(null);
                e18Var.k0(objN);
            }
            nwb nwbVar = (nwb) objN;
            e18Var.p(false);
            e18Var.a0(-316847932);
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                objN2 = new ol5(25, nwbVar);
                e18Var.k0(objN2);
            }
            bz7 bz7Var = (bz7) objN2;
            e18Var.p(false);
            Object objN3 = e18Var.N();
            if (objN3 == lz1Var) {
                b bVar = new b(fd9.O(im6.E, e18Var));
                e18Var.k0(bVar);
                objN3 = bVar;
            }
            l45 l45Var = ((b) objN3).E;
            e18Var.a0(-316834021);
            boolean zH = e18Var.h(l45Var);
            Object objN4 = e18Var.N();
            if (zH || objN4 == lz1Var) {
                objN4 = new b4b(l45Var, i5, nwbVar);
                e18Var.k0(objN4);
            }
            bz7 bz7Var2 = (bz7) objN4;
            e18Var.p(false);
            e18Var.a0(-316803765);
            Object objN5 = e18Var.N();
            if (objN5 == lz1Var) {
                objN5 = g7d.E;
                e18Var.k0(objN5);
            }
            e18Var.p(false);
            pz7 pz7Var = (pz7) ((jm9) objN5);
            e18Var.a0(-316802035);
            Object objN6 = e18Var.N();
            if (objN6 == lz1Var) {
                objN6 = h7d.E;
                e18Var.k0(objN6);
            }
            e18Var.p(false);
            c(v77Var, iqbVar, bz7Var, pz7Var, (pz7) ((jm9) objN6), bz7Var2, e18Var, (i6 & 14) | 28032 | (i6 & 112), 0);
            e18Var.p(false);
            i4 = 1;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ve2(i4, i2, 3, v77Var, iqbVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(defpackage.v77 r19, defpackage.iqb r20, defpackage.bz7 r21, defpackage.pz7 r22, defpackage.pz7 r23, defpackage.bz7 r24, defpackage.ld4 r25, int r26, int r27) {
        /*
            Method dump skipped, instruction units count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dvj.c(v77, iqb, bz7, pz7, pz7, bz7, ld4, int, int):void");
    }

    public static final void d(int i, List list, bz7 bz7Var, float f, iqb iqbVar, ld4 ld4Var, int i2) {
        list.getClass();
        bz7Var.getClass();
        iqbVar.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1130591255);
        int i3 = (e18Var.d(i) ? 4 : 2) | i2 | (e18Var.f(list) ? 32 : 16) | (e18Var.h(bz7Var) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.c(f) ? 2048 : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var.f(iqbVar) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN);
        if (e18Var.Q(i3 & 1, (i3 & 9363) != 9362)) {
            boolean z = ((i3 & 14) == 4) | ((i3 & 112) == 32) | ((i3 & 7168) == 2048) | ((i3 & 896) == 256);
            Object objN = e18Var.N();
            if (z || objN == jd4.a) {
                objN = new uke(i, list, f, bz7Var);
                e18Var.k0(objN);
            }
            bvg.a((i3 >> 12) & 14, 0, e18Var, (pz7) objN, iqbVar);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new lb1(i, list, bz7Var, f, iqbVar, i2);
        }
    }

    public static final exh e(EventSearchV0Output eventSearchV0Output) {
        if (eventSearchV0Output instanceof EventSearchV0OutputEventSearchResult) {
            return new exh(eventSearchV0Output, true);
        }
        if (eventSearchV0Output instanceof EventSearchV0OutputEventSearchError) {
            return new exh(eventSearchV0Output, false);
        }
        wg6.i();
        return null;
    }

    public static final Object f(byte[] bArr, s06 s06Var) throws IOException {
        bArr.getClass();
        ZipInputStream zipInputStream = new ZipInputStream(new ByteArrayInputStream(bArr));
        try {
            zipInputStream.getNextEntry();
            BufferedInputStream bufferedInputStream = new BufferedInputStream(zipInputStream, FreeTypeConstants.FT_LOAD_LINEAR_DESIGN);
            try {
                Object objP = zh4.p(hqi.a, s06Var, bufferedInputStream);
                bufferedInputStream.close();
                zipInputStream.close();
                return objP;
            } finally {
            }
        } finally {
        }
    }

    public static final int g(ex9 ex9Var, ukc ukcVar) {
        return (int) (ukcVar == ukc.E ? ex9Var.t & 4294967295L : ex9Var.t >> 32);
    }

    public static final byte[] h(Object obj, znf znfVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(byteArrayOutputStream);
            try {
                zipOutputStream.setLevel(7);
                zipOutputStream.putNextEntry(new ZipEntry("Entry"));
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(zipOutputStream, FreeTypeConstants.FT_LOAD_LINEAR_DESIGN);
                try {
                    zh4.q(hqi.a, znfVar, obj, bufferedOutputStream);
                    bufferedOutputStream.close();
                    zipOutputStream.close();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    byteArray.getClass();
                    return byteArray;
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }
}
