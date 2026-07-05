package defpackage;

import android.os.Bundle;
import android.os.Looper;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.experience.ExperienceToggle;
import com.anthropic.claude.conway.protocol.ConwayClientInfo;
import com.pvporbit.freetype.FreeTypeConstants;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ask {
    public static final ta4 a = new ta4(534079447, false, new vb4(9));

    /* JADX WARN: Removed duplicated region for block: B:40:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(java.util.List r16, defpackage.zy7 r17, defpackage.zy7 r18, defpackage.iqb r19, defpackage.ld4 r20, int r21, int r22) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ask.a(java.util.List, zy7, zy7, iqb, ld4, int, int):void");
    }

    public static final void b(ConwayClientInfo conwayClientInfo, iqb iqbVar, ld4 ld4Var, int i) {
        iqb iqbVar2;
        e18 e18Var;
        Object obj;
        fqb fqbVar;
        String strJ0;
        conwayClientInfo.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-189301934);
        int i2 = 4;
        int i3 = ((i & 6) == 0 ? i | ((i & 8) == 0 ? e18Var2.f(conwayClientInfo) : e18Var2.h(conwayClientInfo) ? 4 : 2) : i) | 48;
        int i4 = 1;
        if (e18Var2.Q(i3 & 1, (i3 & 19) != 18)) {
            Object[] objArr = {conwayClientInfo.getId()};
            Object objN = e18Var2.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = new fr4(i2);
                e18Var2.k0(objN);
            }
            nwb nwbVar = (nwb) iuj.I(objArr, (zy7) objN, e18Var2, 48);
            boolean z = (i3 & 14) == 4 || ((i3 & 8) != 0 && e18Var2.f(conwayClientInfo));
            Object objN2 = e18Var2.N();
            int i5 = 6;
            if (z || objN2 == lz1Var) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (String str : conwayClientInfo.getTools()) {
                    List listY0 = bsg.Y0(str, new String[]{"__"}, i5);
                    cpc cpcVar = (listY0.size() < 3 || !x44.r(listY0.get(0), "mcp")) ? (listY0.size() < 2 || !x44.r(listY0.get(0), "mcp")) ? new cpc(null, str) : new cpc(null, w44.S0(w44.I0(listY0, 1), " ", null, null, null, 62)) : new cpc(isg.o0((String) listY0.get(1), '_', ' '), w44.S0(w44.I0(listY0, 2), " ", null, null, null, 62));
                    String str2 = (String) cpcVar.E;
                    String str3 = (String) cpcVar.F;
                    Object arrayList = linkedHashMap.get(str2);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(str2, arrayList);
                    }
                    ((Collection) arrayList).add(isg.o0(str3, '_', ' '));
                    i5 = 6;
                }
                ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    arrayList2.add(new z05((String) entry.getKey(), (List) entry.getValue()));
                }
                e18Var2.k0(arrayList2);
                obj = arrayList2;
            } else {
                obj = objN2;
            }
            List list = (List) obj;
            fqb fqbVar2 = fqb.E;
            iqb iqbVarC = b.c(fqbVar2, 1.0f);
            vo1 vo1Var = lja.S;
            q64 q64VarA = p64.a(ko0.c, vo1Var, e18Var2, 0);
            int iHashCode = Long.hashCode(e18Var2.T);
            hyc hycVarL = e18Var2.l();
            iqb iqbVarE = kxk.E(e18Var2, iqbVarC);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            z80 z80Var = cd4.f;
            d4c.i0(e18Var2, z80Var, q64VarA);
            z80 z80Var2 = cd4.e;
            d4c.i0(e18Var2, z80Var2, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var3 = cd4.g;
            d4c.i0(e18Var2, z80Var3, numValueOf);
            bx bxVar = cd4.h;
            d4c.h0(e18Var2, bxVar);
            z80 z80Var4 = cd4.d;
            d4c.i0(e18Var2, z80Var4, iqbVarE);
            wo1 wo1Var = lja.Q;
            iqb iqbVarC2 = b.c(fqbVar2, 1.0f);
            List list2 = list;
            boolean z2 = !list2.isEmpty();
            boolean zF = e18Var2.f(nwbVar);
            Object objN3 = e18Var2.N();
            if (zF || objN3 == lz1Var) {
                fqbVar = fqbVar2;
                objN3 = new vi4(9, nwbVar);
                e18Var2.k0(objN3);
            } else {
                fqbVar = fqbVar2;
            }
            iqb iqbVarC3 = androidx.compose.foundation.b.c(iqbVarC2, z2, null, null, null, (zy7) objN3, 14);
            boolean zH = e18Var2.h(list) | e18Var2.f(nwbVar);
            Object objN4 = e18Var2.N();
            if (zH || objN4 == lz1Var) {
                objN4 = new lj2(list, nwbVar);
                e18Var2.k0(objN4);
            }
            iqb iqbVarK = gb9.K(tjf.b(iqbVarC3, false, (bz7) objN4), 16.0f, 14.0f);
            cxe cxeVarA = axe.a(ko0.a, wo1Var, e18Var2, 48);
            int iHashCode2 = Long.hashCode(e18Var2.T);
            hyc hycVarL2 = e18Var2.l();
            iqb iqbVarE2 = kxk.E(e18Var2, iqbVarK);
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            d4c.i0(e18Var2, z80Var, cxeVarA);
            d4c.i0(e18Var2, z80Var2, hycVarL2);
            ij0.t(iHashCode2, e18Var2, z80Var3, e18Var2, bxVar);
            d4c.i0(e18Var2, z80Var4, iqbVarE2);
            ho0 ho0Var = new ho0(2.0f, true, new sz6(1));
            hw9 hw9Var = new hw9(1.0f, true);
            q64 q64VarA2 = p64.a(ho0Var, vo1Var, e18Var2, 6);
            int iHashCode3 = Long.hashCode(e18Var2.T);
            hyc hycVarL3 = e18Var2.l();
            iqb iqbVarE3 = kxk.E(e18Var2, hw9Var);
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            d4c.i0(e18Var2, z80Var, q64VarA2);
            d4c.i0(e18Var2, z80Var2, hycVarL3);
            ij0.t(iHashCode3, e18Var2, z80Var3, e18Var2, bxVar);
            d4c.i0(e18Var2, z80Var4, iqbVarE3);
            sr4 sr4Var = ConwayClientInfo.Companion;
            Integer numValueOf2 = isg.q0(conwayClientInfo.getName(), "claude-desktop", false) ? Integer.valueOf(R.string.conway_client_claude_desktop) : isg.q0(conwayClientInfo.getName(), "claude-in-chrome", false) ? Integer.valueOf(R.string.conway_client_claude_in_chrome) : isg.q0(conwayClientInfo.getName(), "claude-android", false) ? Integer.valueOf(R.string.conway_client_this_device) : isg.q0(conwayClientInfo.getName(), "claude-ios", false) ? Integer.valueOf(R.string.conway_client_claude_ios) : null;
            if (numValueOf2 == null) {
                e18Var2.a0(-1700970250);
                e18Var2.p(false);
                strJ0 = null;
            } else {
                e18Var2.a0(-1700970249);
                strJ0 = d4c.j0(numValueOf2.intValue(), e18Var2);
                e18Var2.p(false);
            }
            if (strJ0 == null) {
                strJ0 = conwayClientInfo.getName();
            }
            iqbVar2 = fqbVar;
            tjh.b(strJ0, null, gm3.a(e18Var2).M, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).g, e18Var2, 0, 0, 131066);
            tjh.b(d4c.f0(R.plurals.conway_system_capabilities_tools, conwayClientInfo.getTools().size(), new Object[]{Integer.valueOf(conwayClientInfo.getTools().size())}, e18Var2), null, gm3.a(e18Var2).O, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).i, e18Var2, 0, 0, 131066);
            e18Var2.p(true);
            if (list2.isEmpty()) {
                e18Var2.a0(1240872886);
                e18Var2.p(false);
            } else {
                e18Var2.a0(1240547634);
                iv1.b(ud0.B, null, ysk.f(iqbVar2, ((Boolean) nwbVar.getValue()).booleanValue() ? 180.0f : MTTypesetterKt.kLineSkipLimitMultiplier), ef2.F, gm3.a(e18Var2).O, e18Var2, 3120, 0);
                e18Var2.p(false);
            }
            e18Var2.p(true);
            wd6.H(s64.a, ((Boolean) nwbVar.getValue()).booleanValue(), null, null, null, null, fd9.q0(1830392352, new qr4(list, i4), e18Var2), e18Var2, 1572870, 30);
            e18 e18Var3 = e18Var2;
            e18Var3.p(true);
            e18Var = e18Var3;
        } else {
            e18Var2.T();
            iqbVar2 = iqbVar;
            e18Var = e18Var2;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new qq(conwayClientInfo, iqbVar2, i, 15);
        }
    }

    public static final Object c(Class cls, Map map, List list) {
        cls.getClass();
        list.getClass();
        u0h u0hVar = new u0h(new hc0(0, map));
        Object objNewProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new gc0(cls, map, new u0h(new xz(cls, 3, map)), u0hVar, list));
        objNewProxyInstance.getClass();
        return objNewProxyInstance;
    }

    public static /* synthetic */ Object d(Class cls, Map map) {
        Set setKeySet = map.keySet();
        ArrayList arrayList = new ArrayList(x44.y(setKeySet, 10));
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList.add(cls.getDeclaredMethod((String) it.next(), null));
        }
        return c(cls, map, arrayList);
    }

    public static ope e(qh9 qh9Var) {
        try {
            return new ope(qh9Var.s("duration").k(), qh9Var.s("start").k());
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type Worker", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type Worker", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type Worker", e3);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int f(int r5) {
        /*
            r0 = -1
            if (r5 != r0) goto L4
            return r0
        L4:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 34
            r3 = 6
            r4 = 0
            if (r1 >= r2) goto L15
            switch(r5) {
                case 21: goto L14;
                case 22: goto L12;
                case 23: goto L14;
                case 24: goto L12;
                case 25: goto L10;
                case 26: goto L14;
                case 27: goto L12;
                default: goto Lf;
            }
        Lf:
            goto L15
        L10:
            r5 = r4
            goto L15
        L12:
            r5 = 4
            goto L15
        L14:
            r5 = r3
        L15:
            r2 = 30
            if (r1 >= r2) goto L2e
            r2 = 12
            if (r5 == r2) goto L2c
            r2 = 13
            if (r5 == r2) goto L2f
            r2 = 16
            if (r5 == r2) goto L2c
            r2 = 17
            if (r5 == r2) goto L2a
            goto L2e
        L2a:
            r3 = r4
            goto L2f
        L2c:
            r3 = 1
            goto L2f
        L2e:
            r3 = r5
        L2f:
            r5 = 27
            if (r1 >= r5) goto L40
            r5 = 7
            if (r3 == r5) goto L3f
            r5 = 8
            if (r3 == r5) goto L3f
            r5 = 9
            if (r3 == r5) goto L3f
            goto L40
        L3f:
            return r0
        L40:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ask.f(int):int");
    }

    public static final boolean g() {
        return x44.r(Looper.myLooper(), Looper.getMainLooper());
    }

    public static vf0 h(ssc sscVar) {
        int iM = sscVar.m();
        if (sscVar.m() != 1684108385) {
            ysj.u("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int iM2 = sscVar.m();
        byte[] bArr = lw1.a;
        int i = iM2 & 16777215;
        String str = i == 13 ? "image/jpeg" : i == 14 ? "image/png" : null;
        if (str == null) {
            ebh.z("Unrecognized cover art flags: ", i, "MetadataUtil");
            return null;
        }
        sscVar.N(4);
        int i2 = iM - 16;
        byte[] bArr2 = new byte[i2];
        sscVar.k(bArr2, 0, i2);
        return new vf0(3, str, null, bArr2);
    }

    public static ijh i(int i, ssc sscVar, String str) {
        int iM = sscVar.m();
        if (sscVar.m() == 1684108385 && iM >= 22) {
            sscVar.N(10);
            int iG = sscVar.G();
            if (iG > 0) {
                String strP = grc.p(iG, "");
                int iG2 = sscVar.G();
                if (iG2 > 0) {
                    strP = strP + "/" + iG2;
                }
                return new ijh(str, null, nz8.u(strP));
            }
        }
        ysj.u("MetadataUtil", "Failed to parse index/count attribute: ".concat(my1.b(i)));
        return null;
    }

    public static int j(ssc sscVar) {
        int iM = sscVar.m();
        if (sscVar.m() == 1684108385) {
            sscVar.N(8);
            int i = iM - 16;
            if (i == 1) {
                return sscVar.z();
            }
            if (i == 2) {
                return sscVar.G();
            }
            if (i == 3) {
                return sscVar.C();
            }
            if (i == 4 && (sscVar.j() & FreeTypeConstants.FT_LOAD_PEDANTIC) == 0) {
                return sscVar.D();
            }
        }
        ysj.u("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    public static jv8 k(int i, String str, ssc sscVar, boolean z, boolean z2) {
        int iJ = j(sscVar);
        if (z2) {
            iJ = Math.min(1, iJ);
        }
        if (iJ >= 0) {
            return z ? new ijh(str, null, nz8.u(Integer.toString(iJ))) : new m74("und", str, Integer.toString(iJ));
        }
        ysj.u("MetadataUtil", "Failed to parse uint8 attribute: ".concat(my1.b(i)));
        return null;
    }

    public static ijh l(int i, ssc sscVar, String str) {
        int iM = sscVar.m();
        if (sscVar.m() == 1684108385) {
            sscVar.N(8);
            return new ijh(str, null, nz8.u(sscVar.v(iM - 16)));
        }
        ysj.u("MetadataUtil", "Failed to parse text attribute: ".concat(my1.b(i)));
        return null;
    }

    public static void m(int i, gjb gjbVar, iw7 iw7Var, gjb gjbVar2, gjb... gjbVarArr) {
        if (gjbVar2 == null) {
            gjbVar2 = new gjb(new fjb[0]);
        }
        if (gjbVar != null) {
            hz8 hz8VarO = nz8.o();
            for (fjb fjbVar : gjbVar.a) {
                if (f5b.class.isAssignableFrom(fjbVar.getClass())) {
                    hz8VarO.b((fjb) f5b.class.cast(fjbVar));
                }
            }
            iz8 iz8VarListIterator = hz8VarO.g().listIterator(0);
            while (iz8VarListIterator.hasNext()) {
                f5b f5bVar = (f5b) iz8VarListIterator.next();
                if (!f5bVar.a.equals("com.android.capture.fps") || i == 2) {
                    gjbVar2 = gjbVar2.a(f5bVar);
                }
            }
        }
        for (gjb gjbVar3 : gjbVarArr) {
            gjbVar2 = gjbVar2.b(gjbVar3);
        }
        if (gjbVar2.a.length > 0) {
            iw7Var.k = gjbVar2;
        }
    }

    public static Object n(Bundle bundle, String str, Class cls, Object obj) {
        Object obj2 = bundle.get(str);
        if (obj2 == null) {
            return obj;
        }
        if (cls.isAssignableFrom(obj2.getClass())) {
            return obj2;
        }
        String canonicalName = cls.getCanonicalName();
        sz6.j(ij0.m(kgh.r("Invalid conditional user property field type. '", str, "' expected [", canonicalName, "] but was ["), obj2.getClass().getCanonicalName(), "]"));
        return null;
    }

    public static void o(Bundle bundle, Object obj) {
        if (obj instanceof Double) {
            bundle.putDouble(ExperienceToggle.DEFAULT_PARAM_KEY, ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            bundle.putLong(ExperienceToggle.DEFAULT_PARAM_KEY, ((Long) obj).longValue());
        } else {
            bundle.putString(ExperienceToggle.DEFAULT_PARAM_KEY, obj.toString());
        }
    }
}
