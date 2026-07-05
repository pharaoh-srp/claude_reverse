package defpackage;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.os.Looper;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.app.ClaudeAppDestination;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes.dex */
public abstract class iv1 {
    public static final String[] a = {"*/*", "image/*", "video/*"};
    public static final ta4 b = new ta4(-1917527794, false, new xe3(13));
    public static final mrg c = new mrg("sessions_retrofit");
    public static final mrg d = new mrg("sessions_okhttp");
    public static final /* synthetic */ int[] e = {1, 2, 3, 4, 5, 6, 7};

    public static final KSerializer A(pl9 pl9Var, ArrayList arrayList, zy7 zy7Var) {
        KSerializer uo0Var;
        KSerializer faeVar;
        pl9Var.getClass();
        kce kceVar = jce.a;
        if (pl9Var.equals(kceVar.b(Collection.class)) || pl9Var.equals(kceVar.b(List.class)) || pl9Var.equals(kceVar.b(List.class)) || pl9Var.equals(kceVar.b(ArrayList.class))) {
            uo0Var = new uo0((KSerializer) arrayList.get(0), 0);
        } else if (pl9Var.equals(kceVar.b(HashSet.class))) {
            uo0Var = new yf8((KSerializer) arrayList.get(0));
        } else if (pl9Var.equals(kceVar.b(Set.class)) || pl9Var.equals(kceVar.b(Set.class)) || pl9Var.equals(kceVar.b(LinkedHashSet.class))) {
            uo0Var = new uo0((KSerializer) arrayList.get(0), 1);
        } else if (pl9Var.equals(kceVar.b(HashMap.class))) {
            uo0Var = new xf8((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1));
        } else if (pl9Var.equals(kceVar.b(Map.class)) || pl9Var.equals(kceVar.b(Map.class)) || pl9Var.equals(kceVar.b(LinkedHashMap.class))) {
            uo0Var = new f7a((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1));
        } else {
            if (pl9Var.equals(kceVar.b(Map.Entry.class))) {
                KSerializer kSerializer = (KSerializer) arrayList.get(0);
                KSerializer kSerializer2 = (KSerializer) arrayList.get(1);
                kSerializer.getClass();
                kSerializer2.getClass();
                faeVar = new csa(kSerializer, kSerializer2, 0);
            } else if (pl9Var.equals(kceVar.b(cpc.class))) {
                KSerializer kSerializer3 = (KSerializer) arrayList.get(0);
                KSerializer kSerializer4 = (KSerializer) arrayList.get(1);
                kSerializer3.getClass();
                kSerializer4.getClass();
                faeVar = new csa(kSerializer3, kSerializer4, 1);
            } else if (pl9Var.equals(kceVar.b(r7i.class))) {
                KSerializer kSerializer5 = (KSerializer) arrayList.get(0);
                KSerializer kSerializer6 = (KSerializer) arrayList.get(1);
                KSerializer kSerializer7 = (KSerializer) arrayList.get(2);
                kSerializer5.getClass();
                kSerializer6.getClass();
                kSerializer7.getClass();
                uo0Var = new s7i(kSerializer5, kSerializer6, kSerializer7);
            } else if (ez1.I(pl9Var).isArray()) {
                Object objA = zy7Var.a();
                objA.getClass();
                KSerializer kSerializer8 = (KSerializer) arrayList.get(0);
                kSerializer8.getClass();
                faeVar = new fae((pl9) objA, kSerializer8);
            } else {
                uo0Var = null;
            }
            uo0Var = faeVar;
        }
        if (uo0Var != null) {
            return uo0Var;
        }
        KSerializer[] kSerializerArr = (KSerializer[]) arrayList.toArray(new KSerializer[0]);
        KSerializer[] kSerializerArr2 = (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length);
        return x44.B(ez1.I(pl9Var), (KSerializer[]) Arrays.copyOf(kSerializerArr2, kSerializerArr2.length));
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0109, code lost:
    
        r15.substring(r2, r6);
        r0 = java.util.Collections.EMPTY_MAP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x010f, code lost:
    
        r15.substring(r2, r6);
        r0 = java.util.Collections.EMPTY_MAP;
     */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0115 A[PHI: r0 r4
      0x0115: PHI (r0v4 java.util.Map) = (r0v3 java.util.Map), (r0v10 java.util.Map) binds: [B:12:0x0027, B:67:0x0101] A[DONT_GENERATE, DONT_INLINE]
      0x0115: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:12:0x0027, B:67:0x0101] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map B(java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iv1.B(java.lang.String):java.util.Map");
    }

    public static final boolean C(String str) {
        str.getClass();
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void D(defpackage.y5d r14, defpackage.i5i r15, defpackage.akh r16, defpackage.xy8 r17, defpackage.mi6 r18, defpackage.ks0 r19, defpackage.pfh r20, defpackage.jwb r21, defpackage.ovi r22, defpackage.rfh r23, defpackage.vp4 r24) {
        /*
            r0 = r24
            boolean r1 = r0 instanceof defpackage.k60
            if (r1 == 0) goto L16
            r1 = r0
            k60 r1 = (defpackage.k60) r1
            int r2 = r1.F
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.F = r2
        L14:
            r13 = r1
            goto L1c
        L16:
            k60 r1 = new k60
            r1.<init>(r0)
            goto L14
        L1c:
            java.lang.Object r0 = r13.E
            int r1 = r13.F
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 == r2) goto L2b
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r14)
            return
        L2b:
            kotlin.KotlinNothingValueException r14 = defpackage.sq6.y(r0)
            throw r14
        L30:
            defpackage.sf5.h0(r0)
            android.view.View r0 = r14.P()
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 34
            if (r1 < r3) goto L44
            sc4 r1 = new sc4
            r1.<init>(r0)
        L42:
            r9 = r1
            goto L4a
        L44:
            rc4 r1 = new rc4
            r1.<init>(r0)
            goto L42
        L4a:
            r13.F = r2
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r10 = r21
            r11 = r22
            r12 = r23
            E(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iv1.D(y5d, i5i, akh, xy8, mi6, ks0, pfh, jwb, ovi, rfh, vp4):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void E(defpackage.y5d r17, defpackage.i5i r18, defpackage.akh r19, defpackage.xy8 r20, defpackage.mi6 r21, defpackage.bz7 r22, defpackage.zy7 r23, defpackage.rc4 r24, defpackage.jwb r25, defpackage.ovi r26, defpackage.bz7 r27, defpackage.vp4 r28) {
        /*
            r0 = r28
            boolean r1 = r0 instanceof defpackage.l60
            if (r1 == 0) goto L15
            r1 = r0
            l60 r1 = (defpackage.l60) r1
            int r2 = r1.F
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.F = r2
            goto L1a
        L15:
            l60 r1 = new l60
            r1.<init>(r0)
        L1a:
            java.lang.Object r0 = r1.E
            int r2 = r1.F
            r3 = 1
            if (r2 == 0) goto L2d
            if (r2 == r3) goto L29
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r0)
            return
        L29:
            defpackage.sf5.h0(r0)
            goto L58
        L2d:
            defpackage.sf5.h0(r0)
            q60 r4 = new q60
            r16 = 0
            r9 = r17
            r6 = r18
            r7 = r19
            r10 = r20
            r11 = r21
            r12 = r22
            r13 = r23
            r8 = r24
            r5 = r25
            r14 = r26
            r15 = r27
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r1.F = r3
            java.lang.Object r0 = defpackage.fd9.N(r4, r1)
            m45 r1 = defpackage.m45.E
            if (r0 != r1) goto L58
            return
        L58:
            defpackage.sz6.r()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iv1.E(y5d, i5i, akh, xy8, mi6, bz7, zy7, rc4, jwb, ovi, bz7, vp4):void");
    }

    public static void F(wqc wqcVar, ClaudeAppDestination.Detail detail) {
        oua ouaVar = new oua(11);
        wqcVar.getClass();
        wqcVar.m(new yqc(detail, 1), ouaVar);
    }

    public static void G(wqc wqcVar, ClaudeAppDestination.List list) {
        oua ouaVar = new oua(16);
        wqcVar.getClass();
        list.getClass();
        wqcVar.m(new xqc(0, list), ouaVar);
    }

    public static void H(wqc wqcVar, ClaudeAppDestination.Detail detail) {
        oua ouaVar = new oua(18);
        wqcVar.getClass();
        wqcVar.m(new yqc(detail, 0), ouaVar);
    }

    public static void I(wqc wqcVar, ClaudeAppDestination.List list) {
        oua ouaVar = new oua(15);
        list.getClass();
        wqcVar.m(new xqc(1, list), ouaVar);
    }

    public static final KSerializer J(eo9 eo9Var) {
        eo9Var.getClass();
        return K(hof.a, eo9Var);
    }

    public static final KSerializer K(fof fofVar, eo9 eo9Var) {
        fofVar.getClass();
        eo9Var.getClass();
        KSerializer kSerializerV = zh4.v(fofVar, eo9Var, true);
        if (kSerializerV != null) {
            return kSerializerV;
        }
        throw new SerializationException(yfd.M(yfd.I(eo9Var)));
    }

    public static final KSerializer L(fof fofVar, Type type) {
        fofVar.getClass();
        type.getClass();
        KSerializer kSerializerS = ez1.S(fofVar, type, true);
        if (kSerializerS != null) {
            return kSerializerS;
        }
        Class clsP = ez1.P(type);
        clsP.getClass();
        throw new SerializationException(yfd.M(jce.a.b(clsP)));
    }

    public static final KSerializer M(pl9 pl9Var) {
        pl9Var.getClass();
        KSerializer kSerializerB = x44.B(ez1.I(pl9Var), (KSerializer[]) Arrays.copyOf(new KSerializer[0], 0));
        return kSerializerB == null ? (KSerializer) xfd.a.get(pl9Var) : kSerializerB;
    }

    public static final ArrayList N(fof fofVar, List list, boolean z) {
        fofVar.getClass();
        list.getClass();
        if (z) {
            List list2 = list;
            ArrayList arrayList = new ArrayList(x44.y(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(K(fofVar, (eo9) it.next()));
            }
            return arrayList;
        }
        List<eo9> list3 = list;
        ArrayList arrayList2 = new ArrayList(x44.y(list3, 10));
        for (eo9 eo9Var : list3) {
            eo9Var.getClass();
            KSerializer kSerializerV = zh4.v(fofVar, eo9Var, false);
            if (kSerializerV == null) {
                return null;
            }
            arrayList2.add(kSerializerV);
        }
        return arrayList2;
    }

    public static fu5 O(int i, bz7 bz7Var, sz7 sz7Var) {
        if ((i & 2) != 0) {
            bz7Var = wl0.N;
        }
        bz7Var.getClass();
        sz7Var.getClass();
        return new fu5(bz7Var, sz7Var);
    }

    public static fu5 P(rjg rjgVar, bz7 bz7Var, int i) {
        if ((i & 4) != 0) {
            bz7Var = wl0.O;
        }
        bz7Var.getClass();
        return new fu5(bz7Var, new a40(3, rjgVar));
    }

    public static String Q(int i) {
        sq6.a(i);
        int iF = sq6.F(i);
        if (iF == 0) {
            return "disabled";
        }
        if (iF == 1) {
            return "time_based_default";
        }
        if (iF == 2) {
            return "time_based_custom";
        }
        if (iF == 3) {
            return "custom";
        }
        mr9.b();
        return null;
    }

    public static String R(a5c a5cVar) {
        if (a5cVar == null) {
            return "unknown";
        }
        if (a5cVar instanceof y4c) {
            int iOrdinal = ((y4c) a5cVar).ordinal();
            if (iOrdinal == 0) {
                return "disabled";
            }
            if (iOrdinal == 1) {
                return "no_action";
            }
            if (iOrdinal == 2) {
                return "no_eligible_action";
            }
            if (iOrdinal == 3) {
                return "no_previous_view";
            }
            if (iOrdinal == 4) {
                return "unknown";
            }
            mr9.b();
            return null;
        }
        if (!(a5cVar instanceof z4c)) {
            mr9.b();
            return null;
        }
        int iOrdinal2 = ((z4c) a5cVar).ordinal();
        if (iOrdinal2 == 0) {
            return "no_resources";
        }
        if (iOrdinal2 == 1) {
            return "no_initial_resources";
        }
        if (iOrdinal2 == 2) {
            return "not_settled_yet";
        }
        if (iOrdinal2 == 3) {
            return "unknown";
        }
        mr9.b();
        return null;
    }

    public static /* synthetic */ LinkedHashMap S(tj5 tj5Var, Map map, String str, Set set, int i) {
        if ((i & 8) != 0) {
            set = um6.E;
        }
        return tj5Var.a(map, str, null, set);
    }

    public static final BlurMaskFilter a(float f) {
        return new BlurMaskFilter(f, BlurMaskFilter.Blur.NORMAL);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.ud0 r16, java.lang.String r17, defpackage.iqb r18, defpackage.ef2 r19, long r20, defpackage.ld4 r22, int r23, int r24) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iv1.b(ud0, java.lang.String, iqb, ef2, long, ld4, int, int):void");
    }

    public static final void c(final ybg ybgVar, final iqb iqbVar, ld4 ld4Var, final int i, final int i2) {
        int i3;
        ybgVar.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1670685431);
        if ((i & 6) == 0) {
            i3 = (e18Var.f(ybgVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= e18Var.f(iqbVar) ? 32 : 16;
        }
        if (e18Var.Q(i3 & 1, (i3 & 19) != 18)) {
            if (i4 != 0) {
                iqbVar = fqb.E;
            }
            zni.i(ybgVar, iqbVar, knk.c, e18Var, (i3 & 112) | (i3 & 14) | 384);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7() { // from class: dm3
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP0 = x44.p0(i | 1);
                    iv1.c(ybgVar, iqbVar, (ld4) obj, iP0, i2);
                    return iei.a;
                }
            };
        }
    }

    public static final void d(final kja kjaVar, final iqb iqbVar, ld4 ld4Var, final int i) {
        int i2;
        r7e r7eVarS;
        pz7 pz7Var;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1568663381);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(kjaVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.f(iqbVar) ? 32 : 16;
        }
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            String strJ0 = d4c.j0(R.string.login_overview_animation_a11y, e18Var);
            final long j = gm3.a(e18Var).M;
            final long j2 = gm3.a(e18Var).a;
            lz1 lz1Var = jd4.a;
            if (kjaVar == null) {
                e18Var.a0(-1488060913);
                boolean zF = e18Var.f(strJ0);
                Object objN = e18Var.N();
                Object obj = objN;
                if (zF || objN == lz1Var) {
                    j73 j73Var = new j73(strJ0, 7);
                    e18Var.k0(j73Var);
                    obj = j73Var;
                }
                kxk.g(e18Var, tjf.b(iqbVar, false, (bz7) obj));
                e18Var.p(false);
                r7eVarS = e18Var.s();
                if (r7eVarS != null) {
                    pz7Var = new pz7() { // from class: gja
                        @Override // defpackage.pz7
                        public final Object invoke(Object obj2, Object obj3) {
                            int i3 = i;
                            iei ieiVar = iei.a;
                            int i4 = i;
                            iqb iqbVar2 = iqbVar;
                            kja kjaVar2 = kjaVar;
                            ld4 ld4Var2 = (ld4) obj2;
                            ((Integer) obj3).getClass();
                            switch (i3) {
                                case 0:
                                    iv1.d(kjaVar2, iqbVar2, ld4Var2, x44.p0(i4 | 1));
                                    break;
                                default:
                                    iv1.d(kjaVar2, iqbVar2, ld4Var2, x44.p0(i4 | 1));
                                    break;
                            }
                            return ieiVar;
                        }
                    };
                    r7eVarS.d = pz7Var;
                }
                return;
            }
            e18Var.a0(-1487970579);
            e18Var.p(false);
            Object objN2 = e18Var.N();
            Object obj2 = objN2;
            if (objN2 == lz1Var) {
                a80 a80VarA = zh4.a(MTTypesetterKt.kLineSkipLimitMultiplier);
                e18Var.k0(a80VarA);
                obj2 = a80VarA;
            }
            final a80 a80Var = (a80) obj2;
            int i3 = i2 & 14;
            boolean zH = (i3 == 4) | e18Var.h(a80Var);
            Object objN3 = e18Var.N();
            Object obj3 = objN3;
            if (zH || objN3 == lz1Var) {
                jja jjaVar = new jja(kjaVar, a80Var, null);
                e18Var.k0(jjaVar);
                obj3 = jjaVar;
            }
            fd9.i(e18Var, (pz7) obj3, kjaVar);
            boolean zF2 = e18Var.f(strJ0);
            Object objN4 = e18Var.N();
            Object obj4 = objN4;
            if (zF2 || objN4 == lz1Var) {
                j73 j73Var2 = new j73(strJ0, 8);
                e18Var.k0(j73Var2);
                obj4 = j73Var2;
            }
            iqb iqbVarB = tjf.b(iqbVar, false, (bz7) obj4);
            int i4 = (e18Var.h(a80Var) ? 1 : 0) | (i3 == 4 ? 1 : 0) | (e18Var.e(j2) ? 1 : 0) | (e18Var.e(j) ? 1 : 0);
            Object objN5 = e18Var.N();
            if (i4 != 0 || objN5 == lz1Var) {
                bz7 bz7Var = new bz7() { // from class: hja
                    @Override // defpackage.bz7
                    public final Object invoke(Object obj5) {
                        b52 b52Var = (b52) obj5;
                        b52Var.getClass();
                        final c40 c40VarA = f40.a();
                        final c40 c40VarA2 = f40.a();
                        final float fD = k8g.d(b52Var.E.g());
                        final float fIntBitsToFloat = (Float.intBitsToFloat((int) (b52Var.E.g() >> 32)) - fD) / 2.0f;
                        final float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (b52Var.E.g() & 4294967295L)) - fD) / 2.0f;
                        final a80 a80Var2 = a80Var;
                        final kja kjaVar2 = kjaVar;
                        final long j3 = j2;
                        final long j4 = j;
                        return b52Var.a(new bz7() { // from class: ija
                            @Override // defpackage.bz7
                            public final Object invoke(Object obj6) {
                                xd6 xd6Var;
                                c40 c40Var;
                                int i5;
                                xd6 xd6Var2 = (xd6) obj6;
                                xd6Var2.getClass();
                                int iFloatValue = (int) ((Number) a80Var2.e()).floatValue();
                                kja kjaVar3 = kjaVar2;
                                int i6 = 1;
                                int i7 = 0;
                                int iE0 = wd6.e0(iFloatValue, 0, kjaVar3.a - 1);
                                c40 c40Var2 = c40VarA;
                                c40Var2.i();
                                c40 c40Var3 = c40VarA2;
                                c40Var3.i();
                                int[] iArr = kjaVar3.c;
                                int i8 = iArr[iE0];
                                int i9 = iArr[iE0 + 1];
                                while (i8 < i9) {
                                    c40 c40Var4 = kjaVar3.d[i8] == 0 ? c40Var2 : c40Var3;
                                    int i10 = kjaVar3.f[i8];
                                    if (i10 == 0) {
                                        xd6Var = xd6Var2;
                                        c40Var = c40Var3;
                                        i5 = i9;
                                    } else {
                                        int i11 = kjaVar3.g[i8] * 6;
                                        float f = fD;
                                        float f2 = fIntBitsToFloat;
                                        float fA = kja.a(kjaVar3, f, f2, i11, i7);
                                        float f3 = fIntBitsToFloat2;
                                        float fB = kja.b(kjaVar3, f, f3, i11, i6);
                                        float fA2 = kja.a(kjaVar3, f, f2, i11, 4);
                                        float fB2 = kja.b(kjaVar3, f, f3, i11, 5);
                                        c40Var4.g(fA, fB);
                                        float fA3 = kja.a(kjaVar3, f, f2, i11, 2);
                                        float fB3 = kja.b(kjaVar3, f, f3, i11, 3);
                                        int i12 = i10 - 1;
                                        int i13 = 0;
                                        while (i13 < i12) {
                                            int i14 = i11 + 6;
                                            float fA4 = kja.a(kjaVar3, f, f2, i14, 4);
                                            float f4 = fA;
                                            float fB4 = kja.b(kjaVar3, f, f3, i14, 5);
                                            float fA5 = kja.a(kjaVar3, f, f2, i14, 0);
                                            float f5 = fA3;
                                            float fB5 = kja.b(kjaVar3, f, f3, i14, 1);
                                            c40 c40Var5 = c40Var3;
                                            float f6 = f;
                                            float f7 = fB3;
                                            int i15 = i9;
                                            float f8 = f2;
                                            int i16 = i13;
                                            float f9 = f3;
                                            c40Var4.d(f5, f7, fA4, fB4, fA5, fB5);
                                            fA3 = kja.a(kjaVar3, f6, f8, i14, 2);
                                            f2 = f8;
                                            i9 = i15;
                                            fB3 = kja.b(kjaVar3, f6, f9, i14, 3);
                                            i11 = i14;
                                            f = f6;
                                            f3 = f9;
                                            i13 = i16 + 1;
                                            c40Var3 = c40Var5;
                                            fA = f4;
                                            xd6Var2 = xd6Var2;
                                        }
                                        xd6Var = xd6Var2;
                                        c40Var = c40Var3;
                                        float f10 = fA;
                                        float f11 = fB3;
                                        i5 = i9;
                                        if (kjaVar3.e[i8] != 0) {
                                            c40Var4.d(fA3, f11, fA2, fB2, f10, fB);
                                            c40Var4.a.close();
                                        }
                                    }
                                    i8++;
                                    c40Var3 = c40Var;
                                    i9 = i5;
                                    xd6Var2 = xd6Var;
                                    i6 = 1;
                                    i7 = 0;
                                }
                                xd6.c1(xd6Var2, c40Var3, j3, MTTypesetterKt.kLineSkipLimitMultiplier, null, 60);
                                xd6.c1(xd6Var2, c40Var2, j4, MTTypesetterKt.kLineSkipLimitMultiplier, null, 60);
                                return iei.a;
                            }
                        });
                    }
                };
                e18Var.k0(bz7Var);
                objN5 = bz7Var;
            }
            kxk.g(e18Var, zni.t(iqbVarB, (bz7) objN5));
        } else {
            e18Var.T();
        }
        r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            final int i5 = 1;
            pz7Var = new pz7() { // from class: gja
                @Override // defpackage.pz7
                public final Object invoke(Object obj22, Object obj32) {
                    int i32 = i5;
                    iei ieiVar = iei.a;
                    int i42 = i;
                    iqb iqbVar2 = iqbVar;
                    kja kjaVar2 = kjaVar;
                    ld4 ld4Var2 = (ld4) obj22;
                    ((Integer) obj32).getClass();
                    switch (i32) {
                        case 0:
                            iv1.d(kjaVar2, iqbVar2, ld4Var2, x44.p0(i42 | 1));
                            break;
                        default:
                            iv1.d(kjaVar2, iqbVar2, ld4Var2, x44.p0(i42 | 1));
                            break;
                    }
                    return ieiVar;
                }
            };
            r7eVarS.d = pz7Var;
        }
    }

    public static final void e(int i, ld4 ld4Var) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1357012904);
        if (e18Var.Q(i & 1, i != 0)) {
            Object objN = e18Var.N();
            if (objN == jd4.a) {
                objN = new zcd(15);
                e18Var.k0(objN);
            }
            f((zy7) objN, e18Var, 6);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new k8d(i);
        }
    }

    public static final void f(zy7 zy7Var, ld4 ld4Var, int i) {
        r7e r7eVarS;
        gx2 gx2Var;
        xy7 xy7Var;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-2047119994);
        int i2 = 2;
        if (e18Var.Q(i & 1, (i & 3) != 2)) {
            yy7 yy7VarA = pda.a(e18Var);
            if (yy7VarA == null || (xy7Var = (xy7) ((ba4) yy7VarA).K.getValue()) == null) {
                r7eVarS = e18Var.s();
                if (r7eVarS != null) {
                    gx2Var = new gx2(i, i2, zy7Var);
                    r7eVarS.d = gx2Var;
                }
                return;
            }
            boolean zH = e18Var.h(xy7Var);
            Object objN = e18Var.N();
            if (zH || objN == jd4.a) {
                objN = new vk3(xy7Var, 27, zy7Var);
                e18Var.k0(objN);
            }
            fd9.e(xy7Var, zy7Var, (bz7) objN, e18Var);
        } else {
            e18Var.T();
        }
        r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            gx2Var = new gx2(i, 3, zy7Var);
            r7eVarS.d = gx2Var;
        }
    }

    public static final ExecutorService g(boolean z) {
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new gg4(z));
        executorServiceNewFixedThreadPool.getClass();
        return executorServiceNewFixedThreadPool;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(defpackage.lp7 r4, java.lang.Object r5, java.lang.Object r6, defpackage.vp4 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.iq7
            if (r0 == 0) goto L13
            r0 = r7
            iq7 r0 = (defpackage.iq7) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            iq7 r0 = new iq7
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.F
            int r1 = r0.G
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 == r2) goto L27
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            return
        L27:
            java.lang.Object r6 = r0.E
            defpackage.sf5.h0(r7)
            goto L3d
        L2d:
            defpackage.sf5.h0(r7)
            r0.E = r6
            r0.G = r2
            java.lang.Object r4 = r4.g(r5, r0)
            m45 r5 = defpackage.m45.E
            if (r4 != r5) goto L3d
            return
        L3d:
            kotlinx.coroutines.flow.internal.AbortFlowException r4 = new kotlinx.coroutines.flow.internal.AbortFlowException
            r4.<init>(r6)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iv1.h(lp7, java.lang.Object, java.lang.Object, vp4):void");
    }

    public static final Object[] i(Object[] objArr, int i, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        mp0.v0(0, i, 6, objArr, objArr2);
        mp0.s0(i + 2, i, objArr.length, objArr, objArr2);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    public static final Object[] j(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        mp0.v0(0, i, 6, objArr, objArr2);
        mp0.s0(i, i + 2, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static final int m(tze tzeVar, String str) {
        tzeVar.getClass();
        int columnCount = tzeVar.getColumnCount();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= columnCount) {
                i2 = -1;
                break;
            }
            if (str.equals(tzeVar.getColumnName(i2))) {
                break;
            }
            i2++;
        }
        if (i2 >= 0) {
            return i2;
        }
        String strN = grc.n('`', "`", str);
        int columnCount2 = tzeVar.getColumnCount();
        while (true) {
            if (i >= columnCount2) {
                i = -1;
                break;
            }
            if (strN.equals(tzeVar.getColumnName(i))) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return i;
        }
        return -1;
    }

    public static final double n(zh6 zh6Var) {
        long jConvert = zh6Var.E.convert(1L, TimeUnit.SECONDS);
        return jConvert > 0 ? 0.5d * jConvert : 0.5d / r2.convert(1L, r8);
    }

    public static final long o(long j, zh6 zh6Var) {
        long j2;
        int iOrdinal = zh6Var.ordinal();
        if (iOrdinal == 2) {
            j2 = 1;
        } else if (iOrdinal == 3) {
            j2 = 1000;
        } else if (iOrdinal == 4) {
            j2 = 60000;
        } else if (iOrdinal == 5) {
            j2 = 3600000;
        } else {
            if (iOrdinal != 6) {
                xh6.d("Wrong unit for millisMultiplier: ", zh6Var);
                return 0L;
            }
            j2 = 86400000;
        }
        if (j == 0) {
            return 0L;
        }
        if (j == 1) {
            if (j2 <= 4611686018427387903L) {
                return j2;
            }
        } else if (j2 != 1) {
            int iNumberOfLeadingZeros = (128 - Long.numberOfLeadingZeros(j)) - Long.numberOfLeadingZeros(j2);
            if (iNumberOfLeadingZeros < 63) {
                return j * j2;
            }
            if (iNumberOfLeadingZeros <= 63) {
                long j3 = j * j2;
                if (j3 <= 4611686018427387903L) {
                    return j3;
                }
            }
        } else if (j <= 4611686018427387903L) {
            return j;
        }
        return 4611686018427387903L;
    }

    public static final Object p(bg9 bg9Var, s06 s06Var, n78 n78Var) {
        bg9Var.getClass();
        s06Var.getClass();
        w3e w3eVar = new w3e(n78Var, gi2.c.d(16384), bg9Var.a);
        try {
            Object objG = new sqg(bg9Var, qij.G, w3eVar, s06Var.getDescriptor(), null).g(s06Var);
            w3eVar.o();
            return objG;
        } finally {
            w3eVar.D();
        }
    }

    public static final void q(bg9 bg9Var, e99 e99Var, znf znfVar, Object obj) {
        bg9Var.getClass();
        znfVar.getClass();
        new tqg(bg9Var.a.e ? new sd4(e99Var, bg9Var) : new kd4(e99Var), bg9Var, qij.G, new gh9[qij.L.size()]).h(obj, znfVar);
    }

    public static final int r(kz9 kz9Var, Object obj, int i) {
        int iE;
        return (obj == null || kz9Var.a() == 0 || (i < kz9Var.a() && obj.equals(kz9Var.c(i))) || (iE = kz9Var.e(obj)) == -1) ? i : iE;
    }

    public static final iqb s(iqb iqbVar, bt7 bt7Var) {
        return iqbVar.B(new ct7(bt7Var));
    }

    public static final Object t(rwe rweVar) {
        rweVar.getClass();
        return ((bf3) rweVar.F.getValue()).a.a;
    }

    public static final gh3 u(txb txbVar, int i) {
        txbVar.getClass();
        return gh3.e(txbVar.a(i), txbVar.b(i));
    }

    public static final int v(tze tzeVar, String str) {
        tzeVar.getClass();
        int iM = m(tzeVar, str);
        if (iM >= 0) {
            return iM;
        }
        int columnCount = tzeVar.getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i = 0; i < columnCount; i++) {
            arrayList.add(tzeVar.getColumnName(i));
        }
        mr9.m("Column '", str, "' does not exist. Available columns: [", w44.S0(arrayList, null, null, null, null, 63), 93);
        return 0;
    }

    public static final sxb w(txb txbVar, int i) {
        txbVar.getClass();
        return sxb.d(txbVar.getString(i));
    }

    public static final int x(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i < i2) {
                int i4 = i2 % i3;
                if (i4 < 0) {
                    i4 += i3;
                }
                int i5 = i % i3;
                if (i5 < 0) {
                    i5 += i3;
                }
                int i6 = (i4 - i5) % i3;
                if (i6 < 0) {
                    i6 += i3;
                }
                return i2 - i6;
            }
        } else {
            if (i3 >= 0) {
                sz6.p("Step is zero.");
                return 0;
            }
            if (i > i2) {
                int i7 = -i3;
                int i8 = i % i7;
                if (i8 < 0) {
                    i8 += i7;
                }
                int i9 = i2 % i7;
                if (i9 < 0) {
                    i9 += i7;
                }
                int i10 = (i8 - i9) % i7;
                if (i10 < 0) {
                    i10 += i7;
                }
                return i10 + i2;
            }
        }
        return i2;
    }

    public static boolean y(String str) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '*' || cCharAt == '[' || cCharAt == ']' || cCharAt == ',') {
                return true;
            }
        }
        return false;
    }

    public static final int z(int i, int i2) {
        return (i >> i2) & 31;
    }

    public ge0 k(Context context, Looper looper, rl rlVar, Object obj, h88 h88Var, i88 i88Var) {
        return l(context, looper, rlVar, obj, (kmj) h88Var, (kmj) i88Var);
    }

    public ge0 l(Context context, Looper looper, rl rlVar, Object obj, kmj kmjVar, kmj kmjVar2) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }
}
