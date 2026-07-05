package defpackage;

import androidx.health.platform.client.proto.InvalidProtocolBufferException;
import androidx.health.platform.client.proto.b0;
import androidx.health.platform.client.proto.n;
import androidx.health.platform.client.proto.p;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ssk {
    public static final ta4 a = new ta4(384468406, false, new wb4(13));
    public static final ta4 b = new ta4(-943677041, false, new xb4(2));

    /* JADX WARN: Removed duplicated region for block: B:100:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0405  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(com.anthropic.claude.api.conway.HeartbeatRecord r36, defpackage.bz7 r37, defpackage.zy7 r38, defpackage.iqb r39, defpackage.ld4 r40, int r41) {
        /*
            Method dump skipped, instruction units count: 1234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ssk.a(com.anthropic.claude.api.conway.HeartbeatRecord, bz7, zy7, iqb, ld4, int):void");
    }

    public static final void b(fz4 fz4Var, pz7 pz7Var, bz7 bz7Var, iqb iqbVar, ld4 ld4Var, int i) {
        iqb iqbVar2;
        fz4Var.getClass();
        pz7Var.getClass();
        bz7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(779725730);
        int i2 = i | (e18Var.f(fz4Var) ? 4 : 2) | (e18Var.h(pz7Var) ? 32 : 16) | (e18Var.h(bz7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | 3072;
        int i3 = 0;
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            Object[] objArr = new Object[0];
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = new fr4(11);
                e18Var.k0(objN);
            }
            nwb nwbVar = (nwb) iuj.I(objArr, (zy7) objN, e18Var, 48);
            ud0 ud0Var = ud0.Q;
            String strJ0 = d4c.j0(R.string.conway_system_schedules_title, e18Var);
            String strJ02 = d4c.j0(R.string.conway_system_schedules_desc, e18Var);
            ta4 ta4VarQ0 = fd9.q0(-1272139222, new xg4(fz4Var, pz7Var, nwbVar, 5), e18Var);
            fqb fqbVar = fqb.E;
            zsk.c(ud0Var, strJ0, strJ02, fqbVar, null, MTTypesetterKt.kLineSkipLimitMultiplier, ta4VarQ0, e18Var, 1575936, 48);
            String str = (String) nwbVar.getValue();
            if (str == null) {
                e18Var.a0(1627621124);
                e18Var.p(false);
            } else {
                e18Var.a0(1627621125);
                boolean zF = e18Var.f(nwbVar);
                Object objN2 = e18Var.N();
                if (zF || objN2 == lz1Var) {
                    objN2 = new vi4(23, nwbVar);
                    e18Var.k0(objN2);
                }
                ppk.a((zy7) objN2, fd9.q0(-77480468, new hx4(bz7Var, str, nwbVar, i3), e18Var), null, fd9.q0(698767086, new jj2(6, nwbVar), e18Var), null, ijk.c, fd9.q0(-284345231, new rq(str, 20), e18Var), null, 0L, 0L, 0L, 0L, null, e18Var, 1772592, 0, 16276);
                e18Var = e18Var;
                e18Var.p(false);
            }
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fn((Object) fz4Var, (Object) pz7Var, bz7Var, iqbVar2, i, 27);
        }
    }

    public static final void c(iqb iqbVar, rwe rweVar, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1220912491);
        int i2 = i | 6 | (e18Var.h(rweVar) ? 32 : 16);
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            olh.a(false, null, null, fd9.q0(1454066830, new io8(rweVar), e18Var), e18Var, 3072, 7);
            iqbVar = fqb.E;
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new um5(iqbVar, rweVar, i, 22);
        }
    }

    public static int d(byte[] bArr, int i, po0 po0Var) {
        int iJ = j(bArr, i, po0Var);
        int i2 = po0Var.a;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.b();
        }
        if (i2 > bArr.length - iJ) {
            throw InvalidProtocolBufferException.d();
        }
        if (i2 == 0) {
            po0Var.c = f22.G;
            return iJ;
        }
        po0Var.c = f22.e(bArr, iJ, i2);
        return iJ + i2;
    }

    public static int e(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static long f(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public static int g(d7f d7fVar, int i, byte[] bArr, int i2, int i3, o89 o89Var, po0 po0Var) {
        n nVarD = d7fVar.d();
        d7f d7fVar2 = d7fVar;
        byte[] bArr2 = bArr;
        int i4 = i3;
        po0 po0Var2 = po0Var;
        int iO = o(nVarD, d7fVar2, bArr2, i2, i4, po0Var2);
        d7fVar2.b(nVarD);
        po0Var2.c = nVarD;
        o89Var.add(nVarD);
        while (iO < i4) {
            po0 po0Var3 = po0Var2;
            int i5 = i4;
            int iJ = j(bArr2, iO, po0Var3);
            if (i != po0Var3.a) {
                break;
            }
            byte[] bArr3 = bArr2;
            d7f d7fVar3 = d7fVar2;
            n nVarD2 = d7fVar3.d();
            iO = o(nVarD2, d7fVar3, bArr3, iJ, i5, po0Var3);
            d7fVar2 = d7fVar3;
            bArr2 = bArr3;
            i4 = i5;
            po0Var2 = po0Var3;
            d7fVar2.b(nVarD2);
            po0Var2.c = nVarD2;
            o89Var.add(nVarD2);
        }
        return iO;
    }

    public static int h(int i, byte[] bArr, int i2, int i3, b0 b0Var, po0 po0Var) {
        if ((i >>> 3) == 0) {
            throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iL = l(bArr, i2, po0Var);
            b0Var.d(i, Long.valueOf(po0Var.b));
            return iL;
        }
        if (i4 == 1) {
            b0Var.d(i, Long.valueOf(f(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iJ = j(bArr, i2, po0Var);
            int i5 = po0Var.a;
            if (i5 < 0) {
                throw InvalidProtocolBufferException.b();
            }
            if (i5 > bArr.length - iJ) {
                throw InvalidProtocolBufferException.d();
            }
            if (i5 == 0) {
                b0Var.d(i, f22.G);
            } else {
                b0Var.d(i, f22.e(bArr, iJ, i5));
            }
            return iJ + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
            }
            b0Var.d(i, Integer.valueOf(e(bArr, i2)));
            return i2 + 4;
        }
        b0 b0VarC = b0.c();
        int i6 = (i & (-8)) | 4;
        int i7 = po0Var.d + 1;
        po0Var.d = i7;
        if (i7 >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i8 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int iJ2 = j(bArr, i2, po0Var);
            int i9 = po0Var.a;
            if (i9 == i6) {
                i8 = i9;
                i2 = iJ2;
                break;
            }
            i2 = h(i9, bArr, iJ2, i3, b0VarC, po0Var);
            i8 = i9;
        }
        po0Var.d--;
        if (i2 > i3 || i8 != i6) {
            throw InvalidProtocolBufferException.c();
        }
        b0Var.d(i, b0VarC);
        return i2;
    }

    public static int i(int i, byte[] bArr, int i2, po0 po0Var) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 >= 0) {
            po0Var.a = i3 | (b2 << 7);
            return i4;
        }
        int i5 = i3 | ((b2 & 127) << 7);
        int i6 = i2 + 2;
        byte b3 = bArr[i4];
        if (b3 >= 0) {
            po0Var.a = i5 | (b3 << 14);
            return i6;
        }
        int i7 = i5 | ((b3 & 127) << 14);
        int i8 = i2 + 3;
        byte b4 = bArr[i6];
        if (b4 >= 0) {
            po0Var.a = i7 | (b4 << 21);
            return i8;
        }
        int i9 = i7 | ((b4 & 127) << 21);
        int i10 = i2 + 4;
        byte b5 = bArr[i8];
        if (b5 >= 0) {
            po0Var.a = i9 | (b5 << 28);
            return i10;
        }
        int i11 = i9 | ((b5 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                po0Var.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int j(byte[] bArr, int i, po0 po0Var) {
        int i2 = i + 1;
        byte b2 = bArr[i];
        if (b2 < 0) {
            return i(b2, bArr, i2, po0Var);
        }
        po0Var.a = b2;
        return i2;
    }

    public static int k(int i, byte[] bArr, int i2, int i3, o89 o89Var, po0 po0Var) {
        m69 m69Var = (m69) o89Var;
        int iJ = j(bArr, i2, po0Var);
        m69Var.b(po0Var.a);
        while (iJ < i3) {
            int iJ2 = j(bArr, iJ, po0Var);
            if (i != po0Var.a) {
                break;
            }
            iJ = j(bArr, iJ2, po0Var);
            m69Var.b(po0Var.a);
        }
        return iJ;
    }

    public static int l(byte[] bArr, int i, po0 po0Var) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            po0Var.b = j;
            return i2;
        }
        int i3 = i + 2;
        byte b2 = bArr[i2];
        long j2 = (j & 127) | (((long) (b2 & 127)) << 7);
        int i4 = 7;
        while (b2 < 0) {
            int i5 = i3 + 1;
            byte b3 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b3 & 127)) << i4;
            b2 = b3;
            i3 = i5;
        }
        po0Var.b = j2;
        return i3;
    }

    public static final boolean m(qqb qqbVar) {
        qqbVar.getClass();
        return qqbVar.q() == 1 && qqbVar.m() != 3;
    }

    public static int n(Object obj, d7f d7fVar, byte[] bArr, int i, int i2, int i3, po0 po0Var) {
        p pVar = (p) d7fVar;
        int i4 = po0Var.d + 1;
        po0Var.d = i4;
        if (i4 >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iA = pVar.A(obj, bArr, i, i2, i3, po0Var);
        po0Var.d--;
        po0Var.c = obj;
        return iA;
    }

    public static int o(Object obj, d7f d7fVar, byte[] bArr, int i, int i2, po0 po0Var) {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = i(i4, bArr, i3, po0Var);
            i4 = po0Var.a;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw InvalidProtocolBufferException.d();
        }
        int i6 = po0Var.d + 1;
        po0Var.d = i6;
        if (i6 >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i7 = i5 + i4;
        d7fVar.i(obj, bArr, i5, i7, po0Var);
        po0Var.d--;
        po0Var.c = obj;
        return i7;
    }

    public static int p(int i, byte[] bArr, int i2, int i3, po0 po0Var) {
        if ((i >>> 3) == 0) {
            throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return l(bArr, i2, po0Var);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return j(bArr, i2, po0Var) + po0Var.a;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
        }
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (i2 < i3) {
            i2 = j(bArr, i2, po0Var);
            i6 = po0Var.a;
            if (i6 == i5) {
                break;
            }
            i2 = p(i6, bArr, i2, i3, po0Var);
        }
        if (i2 > i3 || i6 != i5) {
            throw InvalidProtocolBufferException.c();
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object q(defpackage.poc r4, defpackage.o6e r5, defpackage.vp4 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.erh
            if (r0 == 0) goto L13
            r0 = r6
            erh r0 = (defpackage.erh) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            erh r0 = new erh
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.F
            int r1 = r0.G
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L2a
            o6e r5 = r0.E
            defpackage.sf5.h0(r6)     // Catch: androidx.glance.session.TimeoutCancellationException -> L28
            return r6
        L28:
            r4 = move-exception
            goto L48
        L2a:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            return r2
        L30:
            defpackage.sf5.h0(r6)
            r0.E = r5     // Catch: androidx.glance.session.TimeoutCancellationException -> L28
            r0.G = r3     // Catch: androidx.glance.session.TimeoutCancellationException -> L28
            v2h r6 = new v2h     // Catch: androidx.glance.session.TimeoutCancellationException -> L28
            r1 = 8
            r6.<init>(r5, r4, r2, r1)     // Catch: androidx.glance.session.TimeoutCancellationException -> L28
            java.lang.Object r4 = defpackage.fd9.N(r6, r0)     // Catch: androidx.glance.session.TimeoutCancellationException -> L28
            m45 r5 = defpackage.m45.E
            if (r4 != r5) goto L47
            return r5
        L47:
            return r4
        L48:
            int r6 = r4.F
            int r5 = r5.hashCode()
            if (r6 != r5) goto L51
            return r2
        L51:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ssk.q(poc, o6e, vp4):java.lang.Object");
    }

    public static int r(int i) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i2 = 0; i2 < 6; i2++) {
            int i3 = iArr[i2];
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == i) {
                return i3;
            }
        }
        return 1;
    }
}
