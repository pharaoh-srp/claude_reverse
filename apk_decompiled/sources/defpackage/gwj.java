package defpackage;

import android.graphics.Canvas;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.fonts.Font;
import com.anthropic.claude.sessions.types.BridgeEnvironmentInfo;
import com.anthropic.claude.sessions.types.EnvironmentKind;
import com.anthropic.claude.sessions.types.EnvironmentResource;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gwj {
    public static final ta4 a = new ta4(353536115, false, new ua4(25));
    public static final int[] b = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    /* JADX WARN: Removed duplicated region for block: B:55:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(java.lang.String r18, defpackage.bpc r19, boolean r20, defpackage.zy7 r21, defpackage.x0a r22, defpackage.iqb r23, defpackage.ld4 r24, int r25, int r26) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gwj.a(java.lang.String, bpc, boolean, zy7, x0a, iqb, ld4, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(com.anthropic.claude.api.chat.MessageBlobFile r16, defpackage.ej7 r17, defpackage.zy7 r18, defpackage.rc8 r19, defpackage.ld4 r20, int r21) {
        /*
            Method dump skipped, instruction units count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gwj.b(com.anthropic.claude.api.chat.MessageBlobFile, ej7, zy7, rc8, ld4, int):void");
    }

    public static final void c(q68 q68Var, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1380468206);
        if ((((e18Var.f(q68Var) ? 4 : 2) | i) & 3) == 2 && e18Var.C()) {
            e18Var.T();
        } else {
            e18Var.b0(1849434622);
            Object objN = e18Var.N();
            if (objN == jd4.a) {
                objN = ffg.E;
                e18Var.k0(objN);
            }
            byte b2 = 0;
            e18Var.p(false);
            zy7 zy7Var = (zy7) ((jm9) objN);
            e18Var.b0(-1115894518);
            e18Var.b0(1886828752);
            if (!(e18Var.a instanceof gn0)) {
                iuj.A();
                throw null;
            }
            e18Var.Y();
            if (e18Var.S) {
                e18Var.k(new r68(0, zy7Var));
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, new qte(b2, 19), q68Var);
            e18Var.p(true);
            e18Var.p(false);
            e18Var.p(false);
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ska(q68Var, i, 29);
        }
    }

    public static void d(Canvas canvas, int[] iArr, int i, float[] fArr, int i2, int i3, Font font, Paint paint) {
        canvas.drawGlyphs(iArr, i, fArr, i2, i3, font, paint);
    }

    public static void e(Canvas canvas, NinePatch ninePatch, Rect rect, Paint paint) {
        canvas.drawPatch(ninePatch, rect, paint);
    }

    public static void f(Canvas canvas, NinePatch ninePatch, RectF rectF, Paint paint) {
        canvas.drawPatch(ninePatch, rectF, paint);
    }

    public static uvi g(qh9 qh9Var) {
        try {
            String strM = qh9Var.s("test_execution_id").m();
            strM.getClass();
            return new uvi(strM);
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type CiTest", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type CiTest", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type CiTest", e3);
            return null;
        }
    }

    public static final int h(EnvironmentResource environmentResource) {
        Integer max_sessions;
        environmentResource.getClass();
        BridgeEnvironmentInfo bridge_info = environmentResource.getBridge_info();
        if (bridge_info == null || (max_sessions = bridge_info.getMax_sessions()) == null) {
            return 1;
        }
        return max_sessions.intValue();
    }

    public static boolean i(int i, boolean z) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        if (i == 1751476579 && z) {
            return true;
        }
        for (int i2 = 0; i2 < 29; i2++) {
            if (b[i2] == i) {
                return true;
            }
        }
        return false;
    }

    public static final boolean j(EnvironmentResource environmentResource) {
        environmentResource.getClass();
        return environmentResource.getKind() == EnvironmentKind.BRIDGE;
    }

    public static final String k(EnvironmentResource environmentResource) {
        String machine_name;
        BridgeEnvironmentInfo bridge_info = environmentResource.getBridge_info();
        return (bridge_info == null || (machine_name = bridge_info.getMachine_name()) == null) ? environmentResource.getName() : machine_name;
    }

    public static final String l(EnvironmentResource environmentResource) {
        String directory;
        String strN1;
        BridgeEnvironmentInfo bridge_info = environmentResource.getBridge_info();
        if (bridge_info == null || (directory = bridge_info.getDirectory()) == null || (strN1 = bsg.n1(directory, '/')) == null) {
            return null;
        }
        String strD1 = bsg.d1('/', strN1, strN1);
        if (strD1.length() > 0) {
            return strD1;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static qdg m(xd7 xd7Var, boolean z, boolean z2) {
        qdg qdgVar;
        int i;
        long j;
        int i2;
        long jT;
        int i3;
        int i4;
        long j2;
        int i5;
        boolean z3;
        int[] iArr;
        long length = xd7Var.getLength();
        long j3 = -1;
        int i6 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j4 = 4096;
        if (i6 != 0 && length <= 4096) {
            j4 = length;
        }
        int i7 = (int) j4;
        ssc sscVar = new ssc(64);
        int i8 = 0;
        int i9 = 0;
        boolean z4 = false;
        while (i9 < i7) {
            sscVar.J(8);
            if (!xd7Var.d(sscVar.a, i8, 8, true)) {
                break;
            }
            long jB = sscVar.B();
            int iM = sscVar.m();
            if (jB == 1) {
                j = j3;
                xd7Var.p(sscVar.a, 8, 8);
                i4 = 16;
                sscVar.L(16);
                i2 = i9;
                jT = sscVar.t();
                i3 = i6;
            } else {
                j = j3;
                if (jB == 0) {
                    long length2 = xd7Var.getLength();
                    if (length2 != j) {
                        jB = (length2 - xd7Var.e()) + 8;
                    }
                }
                long j5 = jB;
                i2 = i9;
                jT = j5;
                i3 = i6;
                i4 = 8;
            }
            long j6 = i4;
            if (jT < j6) {
                qdgVar = null;
                if (iM != 1718773093 || i4 != 8) {
                    return new s11(iM, i4, jT);
                }
                jT = j6;
            } else {
                qdgVar = null;
            }
            int i10 = i2 + i4;
            if (iM == 1836019574 || iM == 1970628964) {
                i7 += (int) jT;
                if (i3 != 0 && i7 > length) {
                    i7 = (int) length;
                }
                if (iM == 1836019574) {
                    i9 = i10;
                    i6 = i3;
                    j3 = j;
                    i8 = 0;
                }
            }
            if (iM != 1953653099 && iM != 1835297121 && iM != 1835626086) {
                if (iM != 1836019558 && iM != 1836475768) {
                    if (iM == 1835295092) {
                        z4 = true;
                    }
                    if (iM != 1937007212 || jT <= 1000000) {
                        j2 = length;
                        if ((((long) i10) + jT) - j6 < i7) {
                            int i11 = (int) (jT - j6);
                            i9 = i10 + i11;
                            if (iM != 1718909296) {
                                i5 = 0;
                                if (i11 != 0) {
                                    xd7Var.f(i11);
                                }
                            } else {
                                if (i11 < 8) {
                                    return new s11(iM, 8, i11);
                                }
                                sscVar.J(i11);
                                i5 = 0;
                                xd7Var.p(sscVar.a, 0, i11);
                                int iM2 = sscVar.m();
                                if (i(iM2, z2)) {
                                    z4 = true;
                                }
                                sscVar.N(4);
                                int iA = sscVar.a() / 4;
                                if (!z4 && iA > 0) {
                                    int[] iArr2 = new int[iA];
                                    int i12 = 0;
                                    while (true) {
                                        if (i12 >= iA) {
                                            z3 = z4;
                                            iArr = iArr2;
                                            break;
                                        }
                                        int iM3 = sscVar.m();
                                        iArr2[i12] = iM3;
                                        if (i(iM3, z2)) {
                                            z3 = true;
                                            iArr = iArr2;
                                            break;
                                        }
                                        i12++;
                                    }
                                } else {
                                    z3 = z4;
                                    iArr = qdgVar;
                                }
                                if (!z3) {
                                    return new at(iM2, iArr);
                                }
                                z4 = z3;
                            }
                        }
                    }
                    i = 0;
                    break;
                }
                i = 1;
                break;
            }
            j2 = length;
            i5 = 0;
            i9 = i10;
            i8 = i5;
            i6 = i3;
            j3 = j;
            length = j2;
        }
        qdgVar = null;
        i = i8;
        return !z4 ? tqh.P : z != i ? i != 0 ? r09.G : r09.H : qdgVar;
    }
}
