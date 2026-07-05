package defpackage;

import com.anthropic.claude.R;
import com.anthropic.claude.api.chat.MessageBlobFile;
import com.anthropic.claude.api.chat.MessageDocumentFile;
import com.anthropic.claude.api.chat.MessageFile;
import com.anthropic.claude.api.chat.MessageImageFile;
import com.pvporbit.freetype.FreeTypeConstants;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gik {
    public static final ta4 a;
    public static final String[] b;
    public static final String[] c;
    public static final String[] d;

    static {
        new ta4(1622627506, false, new gb4(21));
        a = new ta4(-2139562736, false, new db4(17));
        b = new String[]{"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
        c = new String[]{"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
        d = new String[]{"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};
    }

    public static final void a(Set set, zy7 zy7Var, zy7 zy7Var2, ah2 ah2Var, ld4 ld4Var, int i) {
        int i2;
        ah2 ah2Var2;
        int i3;
        ah2 ah2Var3;
        set.getClass();
        zy7Var.getClass();
        zy7Var2.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1467806237);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? e18Var.f(set) : e18Var.h(set) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.h(zy7Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.h(zy7Var2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        int i4 = 0;
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            e18Var.V();
            int i5 = i & 1;
            lz1 lz1Var = jd4.a;
            if (i5 == 0 || e18Var.A()) {
                m7f m7fVar = (m7f) e18Var.j(gr9.b);
                boolean zH = ((((i2 & 14) ^ 6) > 4 && e18Var.h(set)) || (i2 & 6) == 4) | e18Var.h(m7fVar);
                Object objN = e18Var.N();
                if (zH || objN == lz1Var) {
                    objN = new l0(set, 29, m7fVar);
                    e18Var.k0(objN);
                }
                kce kceVar = jce.a;
                i3 = i2 & (-7169);
                ah2Var3 = (ah2) fd9.r0(kceVar.b(ah2.class), oq5.B(kceVar.b(ah2.class)), (bz7) objN, e18Var);
            } else {
                e18Var.T();
                i3 = i2 & (-7169);
                ah2Var3 = ah2Var;
            }
            e18Var.q();
            zy1 zy1Var = ah2Var3.d;
            boolean z = (i3 & 112) == 32;
            Object objN2 = e18Var.N();
            if (z || objN2 == lz1Var) {
                objN2 = new zg2(zy7Var, null, i4);
                e18Var.k0(objN2);
            }
            x44.b(zy1Var, (pz7) objN2, e18Var, 0);
            Object objN3 = e18Var.N();
            if (objN3 == lz1Var) {
                objN3 = sq6.p(e18Var);
            }
            ybg ybgVar = (ybg) objN3;
            zni.g(ah2Var3.e, ybgVar, e18Var, 48);
            String strF0 = d4c.f0(R.plurals.move_chats_title, set.size(), new Object[]{Integer.valueOf(set.size())}, e18Var);
            String strJ0 = d4c.j0(R.string.move_chats_description, e18Var);
            boolean zF = e18Var.f(ah2Var3);
            Object objN4 = e18Var.N();
            if (zF || objN4 == lz1Var) {
                ub2 ub2Var = new ub2(1, ah2Var3, ah2.class, "moveToProject", "moveToProject(Lcom/anthropic/claude/api/project/Project;)V", 0, 3);
                e18Var.k0(ub2Var);
                objN4 = ub2Var;
            }
            mvk.d(strF0, strJ0, (bz7) ((jm9) objN4), zy7Var2, null, ybgVar, e18Var, ((i3 << 3) & 7168) | 196608);
            ah2Var2 = ah2Var3;
        } else {
            e18Var.T();
            ah2Var2 = ah2Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new xd(set, zy7Var, zy7Var2, ah2Var2, i, 12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.nrg r4, java.util.ArrayList r5, defpackage.np5 r6, defpackage.xne r7, defpackage.vp4 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.prg
            if (r0 == 0) goto L13
            r0 = r8
            prg r0 = (defpackage.prg) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            prg r0 = new prg
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.F
            int r1 = r0.G
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            java.util.ArrayList r5 = r0.E
            defpackage.sf5.h0(r8)
            goto L3e
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.sf5.h0(r8)
            r0.E = r5
            r0.G = r2
            java.lang.Object r8 = h(r4, r6, r7, r0)
            m45 r4 = defpackage.m45.E
            if (r8 != r4) goto L3e
            return r4
        L3e:
            java.lang.String r8 = (java.lang.String) r8
            ide r4 = defpackage.qrg.a
            r8.getClass()
            r5.getClass()
            ide r4 = defpackage.qrg.a
            hj2 r6 = new hj2
            r7 = 9
            r6.<init>(r5, r7)
            java.lang.String r4 = r4.g(r8, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gik.b(nrg, java.util.ArrayList, np5, xne, vp4):java.lang.Object");
    }

    public static long c(long j, long j2) {
        long j3 = j + j2;
        if (((j ^ j2) < 0) || ((j ^ j3) >= 0)) {
            return j3;
        }
        throw new ArithmeticException(grc.r(j2, ")", grc.w(j, "overflow: checkedAdd(", ", ")));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static long d(long j, long j2, RoundingMode roundingMode) {
        roundingMode.getClass();
        long j3 = j / j2;
        long j4 = j - (j2 * j3);
        if (j4 == 0) {
            return j3;
        }
        int i = ((int) ((j ^ j2) >> 63)) | 1;
        switch (jka.a[roundingMode.ordinal()]) {
            case 1:
                zmk.j(j4 == 0);
                return j3;
            case 2:
                return j3;
            case 3:
                if (i >= 0) {
                    return j3;
                }
                return j3 + ((long) i);
            case 4:
                return j3 + ((long) i);
            case 5:
                if (i <= 0) {
                    return j3;
                }
                return j3 + ((long) i);
            case 6:
            case 7:
            case 8:
                long jAbs = Math.abs(j4);
                long jAbs2 = jAbs - (Math.abs(j2) - jAbs);
                if (jAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j3) == 0)) {
                        return j3;
                    }
                } else if (jAbs2 <= 0) {
                    return j3;
                }
                return j3 + ((long) i);
            default:
                mr9.u();
                return 0L;
        }
    }

    public static dt6 e(qh9 qh9Var) {
        int i;
        String strM;
        String strM2;
        try {
            bh9 bh9VarS = qh9Var.s("status");
            int i2 = 0;
            if (bh9VarS != null && (strM2 = bh9VarS.m()) != null) {
                int[] iArrH = sq6.H(4);
                int length = iArrH.length;
                for (int i3 = 0; i3 < length; i3++) {
                    i = iArrH[i3];
                    if (!ms6.g(i).equals(strM2)) {
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            i = 0;
            bh9 bh9VarS2 = qh9Var.s("error_reason");
            if (bh9VarS2 != null && (strM = bh9VarS2.m()) != null) {
                int[] iArrH2 = sq6.H(4);
                int length2 = iArrH2.length;
                while (i2 < length2) {
                    int i4 = iArrH2[i2];
                    if (ms6.o(i4).equals(strM)) {
                        i2 = i4;
                    } else {
                        i2++;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            return new dt6(i, i2);
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type Profiling", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type Profiling", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type Profiling", e3);
            return null;
        }
    }

    public static gxi f(qh9 qh9Var) {
        try {
            return new gxi(qh9Var.s("start").k(), qh9Var.s("duration").k());
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type SlowFrame", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type SlowFrame", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type SlowFrame", e3);
            return null;
        }
    }

    public static long g(long j, long j2) {
        zmk.i(j, "a");
        zmk.i(j2, "b");
        if (j == 0) {
            return j2;
        }
        if (j2 == 0) {
            return j;
        }
        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j);
        long jNumberOfTrailingZeros = j >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(j2);
        long j3 = j2 >> iNumberOfTrailingZeros2;
        while (jNumberOfTrailingZeros != j3) {
            long j4 = jNumberOfTrailingZeros - j3;
            long j5 = (j4 >> 63) & j4;
            long j6 = (j4 - j5) - j5;
            j3 += j5;
            jNumberOfTrailingZeros = j6 >> Long.numberOfTrailingZeros(j6);
        }
        return jNumberOfTrailingZeros << Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h(defpackage.nrg r7, defpackage.np5 r8, defpackage.xne r9, defpackage.vp4 r10) {
        /*
            boolean r0 = r10 instanceof defpackage.org
            if (r0 == 0) goto L13
            r0 = r10
            org r0 = (defpackage.org) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.F = r1
            goto L18
        L13:
            org r0 = new org
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.E
            int r1 = r0.F
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L26
            defpackage.sf5.h0(r10)
            goto L71
        L26:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r7)
            return r3
        L2c:
            defpackage.sf5.h0(r10)
            spe r7 = defpackage.aoe.a(r7, r9)
            r0.F = r2
            epk r9 = defpackage.qrg.b
            java.lang.String r10 = r7.b
            long r1 = r7.c
            long r4 = r7.d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r10)
            java.lang.String r10 = "/"
            r6.append(r10)
            r6.append(r1)
            java.lang.String r10 = "-"
            r6.append(r10)
            r6.append(r4)
            java.lang.String r10 = r6.toString()
            ny r1 = new ny
            r2 = 13
            r1.<init>(r8, r7, r3, r2)
            r9.getClass()
            ky0 r7 = new ky0
            r7.<init>(r9, r10, r1, r3)
            java.lang.Object r10 = defpackage.fd9.N(r7, r0)
            m45 r7 = defpackage.m45.E
            if (r10 != r7) goto L71
            return r7
        L71:
            r10.getClass()
            hrg r10 = (defpackage.hrg) r10
            java.lang.String r7 = r10.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gik.h(nrg, np5, xne, vp4):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c8, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.xg8 i(java.lang.String r19) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gik.i(java.lang.String):xg8");
    }

    public static vde j(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        hz8 hz8VarO = nz8.o();
        String strConcat = str.concat(":Item");
        String strConcat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (pmk.i(xmlPullParser, strConcat)) {
                String strConcat3 = str2.concat(":Mime");
                String strConcat4 = str2.concat(":Semantic");
                String strConcat5 = str2.concat(":Length");
                String strConcat6 = str2.concat(":Padding");
                String strG = pmk.g(xmlPullParser, strConcat3);
                String strG2 = pmk.g(xmlPullParser, strConcat4);
                String strG3 = pmk.g(xmlPullParser, strConcat5);
                String strG4 = pmk.g(xmlPullParser, strConcat6);
                if (strG == null || strG2 == null) {
                    return vde.I;
                }
                hz8VarO.b(new wrb(strG, strG3 != null ? Long.parseLong(strG3) : 0L, strG4 != null ? Long.parseLong(strG4) : 0L));
            }
        } while (!pmk.h(xmlPullParser, strConcat2));
        return hz8VarO.g();
    }

    public static long k(long j, long j2) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(~j2) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j);
        if (iNumberOfLeadingZeros > 65) {
            return j * j2;
        }
        long j3 = ((j ^ j2) >>> 63) + Long.MAX_VALUE;
        if (!((iNumberOfLeadingZeros < 64) | ((j2 == Long.MIN_VALUE) & (j < 0)))) {
            long j4 = j * j2;
            if (j == 0 || j4 / j == j2) {
                return j4;
            }
        }
        return j3;
    }

    public static final String l(nrg nrgVar, ld4 ld4Var) {
        nrgVar.getClass();
        np5 np5VarS = zh4.s(dqe.a, ld4Var);
        e18 e18Var = (e18) ld4Var;
        Object objN = e18Var.N();
        lz1 lz1Var = jd4.a;
        if (objN == lz1Var) {
            objN = new crg(8);
            e18Var.k0(objN);
        }
        zy7 zy7Var = (zy7) objN;
        boolean zF = e18Var.f(nrgVar) | e18Var.h(np5VarS);
        Object objN2 = e18Var.N();
        tp4 tp4Var = null;
        if (zF || objN2 == lz1Var) {
            objN2 = new ba9(nrgVar, np5VarS, tp4Var, 28);
            e18Var.k0(objN2);
        }
        pz7 pz7Var = (pz7) objN2;
        zy7Var.getClass();
        pz7Var.getClass();
        ((yne) e18Var.j(aoe.b)).getClass();
        xne xneVarA = yne.a(e18Var);
        boolean zF2 = e18Var.f(nrgVar) | e18Var.f(xneVarA);
        Object objN3 = e18Var.N();
        if (zF2 || objN3 == lz1Var) {
            objN3 = mpk.P(gb9.V(im6.E, new eqe(pz7Var, xneVarA, tp4Var, 0)));
            e18Var.k0(objN3);
        }
        return (String) ((nwb) objN3).getValue();
    }

    public static final String m(nrg nrgVar, Object[] objArr, ld4 ld4Var) {
        Object lzaVar;
        nrg nrgVar2;
        nrgVar.getClass();
        np5 np5VarS = zh4.s(dqe.a, ld4Var);
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(obj.toString());
        }
        e18 e18Var = (e18) ld4Var;
        Object objN = e18Var.N();
        lz1 lz1Var = jd4.a;
        if (objN == lz1Var) {
            objN = new crg(8);
            e18Var.k0(objN);
        }
        zy7 zy7Var = (zy7) objN;
        boolean zF = e18Var.f(nrgVar) | e18Var.h(arrayList) | e18Var.h(np5VarS);
        Object objN2 = e18Var.N();
        tp4 tp4Var = null;
        if (zF || objN2 == lz1Var) {
            nrgVar2 = nrgVar;
            lzaVar = new lza(nrgVar2, arrayList, np5VarS, tp4Var, 18);
            e18Var.k0(lzaVar);
        } else {
            lzaVar = objN2;
            nrgVar2 = nrgVar;
        }
        pz7 pz7Var = (pz7) lzaVar;
        zy7Var.getClass();
        pz7Var.getClass();
        ((yne) e18Var.j(aoe.b)).getClass();
        xne xneVarA = yne.a(e18Var);
        boolean zF2 = e18Var.f(nrgVar2) | e18Var.f(arrayList) | e18Var.f(xneVarA);
        Object objN3 = e18Var.N();
        if (zF2 || objN3 == lz1Var) {
            objN3 = mpk.P(gb9.V(im6.E, new eqe(pz7Var, xneVarA, tp4Var, 1)));
            e18Var.k0(objN3);
        }
        return (String) ((nwb) objN3).getValue();
    }

    public static final end n(MessageFile messageFile, String str) {
        messageFile.getClass();
        str.getClass();
        if (messageFile instanceof MessageImageFile) {
            MessageImageFile messageImageFile = (MessageImageFile) messageFile;
            return new end(str, messageImageFile.getFile_name(), messageImageFile.getCreated_at(), messageImageFile.mo236getFile_uuidExWXDbg(), messageImageFile, nkk.d(messageFile));
        }
        if (!(messageFile instanceof MessageDocumentFile)) {
            if (!(messageFile instanceof MessageBlobFile)) {
                return null;
            }
            MessageBlobFile messageBlobFile = (MessageBlobFile) messageFile;
            return new end(str, messageBlobFile.getFile_name(), messageBlobFile.getCreated_at(), messageBlobFile.mo236getFile_uuidExWXDbg(), messageBlobFile, null);
        }
        MessageDocumentFile messageDocumentFile = (MessageDocumentFile) messageFile;
        return new end(str, messageDocumentFile.getFile_name(), messageDocumentFile.getCreated_at(), messageDocumentFile.mo236getFile_uuidExWXDbg(), messageDocumentFile, messageDocumentFile.getThumbnail_asset());
    }
}
