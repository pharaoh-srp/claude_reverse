package defpackage;

import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import androidx.health.platform.client.proto.t;
import com.anthropic.claude.api.mcp.CaiMcpFlag;
import com.anthropic.claude.api.mcp.McpPrompt;
import com.anthropic.claude.api.mcp.McpResource;
import com.anthropic.claude.api.mcp.McpServer;
import com.anthropic.claude.api.mcp.McpTool;
import com.anthropic.claude.api.mcp.McpToolMaxPermission;
import com.anthropic.claude.api.mcp.McpToolMeta;
import com.anthropic.claude.api.mcp.McpToolUiMeta;
import com.anthropic.claude.api.mcp.McpToolVisibility;
import com.anthropic.claude.types.strings.McpToolKey;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class qok {
    public static final ta4 a = new ta4(-994486510, false, new sb4(22));

    public static final void a(q68 q68Var, int i, ta4 ta4Var, ld4 ld4Var, int i2) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-474572032);
        int i3 = 2;
        if ((((e18Var.f(q68Var) ? 4 : 2) | i2 | 48 | (e18Var.d(i) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC)) & 1171) == 1170 && e18Var.C()) {
            e18Var.T();
        } else {
            e18Var.b0(1849434622);
            Object objN = e18Var.N();
            if (objN == jd4.a) {
                objN = o64.E;
                e18Var.k0(objN);
            }
            e18Var.p(false);
            zy7 zy7Var = (zy7) ((jm9) objN);
            e18Var.b0(-683746039);
            e18Var.b0(-548224868);
            if (!(e18Var.a instanceof gn0)) {
                iuj.A();
                throw null;
            }
            e18Var.Y();
            if (e18Var.S) {
                e18Var.k(zy7Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, new m14(1), q68Var);
            d4c.i0(e18Var, new m14(i3), new pt(i));
            d4c.i0(e18Var, new m14(3), new rt(0));
            ta4Var.invoke(r64.a, e18Var, 54);
            e18Var.p(true);
            e18Var.p(false);
            e18Var.p(false);
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new n64(q68Var, i, ta4Var, i2, 0);
        }
    }

    public static final void b(d8a d8aVar, kw7 kw7Var) {
        if (kw7Var instanceof xe1) {
            d8aVar.add(((xe1) kw7Var).a);
            return;
        }
        if (kw7Var instanceof ze4) {
            Iterator it = ((ze4) kw7Var).a.iterator();
            while (it.hasNext()) {
                b(d8aVar, (c6c) it.next());
            }
            return;
        }
        if (kw7Var instanceof gl4) {
            return;
        }
        if (kw7Var instanceof u6g) {
            b(d8aVar, ((u6g) kw7Var).a);
            return;
        }
        if (!(kw7Var instanceof pw)) {
            if (kw7Var instanceof mjc) {
                b(d8aVar, ((mjc) kw7Var).b);
                return;
            } else {
                wg6.i();
                return;
            }
        }
        pw pwVar = (pw) kw7Var;
        b(d8aVar, pwVar.a);
        Iterator it2 = pwVar.b.iterator();
        while (it2.hasNext()) {
            b(d8aVar, (kw7) it2.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ppe c(qh9 qh9Var) {
        ppe ppeVar;
        int i;
        String strM;
        qh9Var.getClass();
        try {
            long jK = qh9Var.s("date").k();
            doe doeVarH = lok.h(qh9Var.s("application").g());
            bh9 bh9VarS = qh9Var.s("service");
            String strM2 = bh9VarS != null ? bh9VarS.m() : null;
            bh9 bh9VarS2 = qh9Var.s("version");
            String strM3 = bh9VarS2 != null ? bh9VarS2.m() : null;
            bh9 bh9VarS3 = qh9Var.s("build_version");
            String strM4 = bh9VarS3 != null ? bh9VarS3.m() : null;
            bh9 bh9VarS4 = qh9Var.s("build_id");
            String strM5 = bh9VarS4 != null ? bh9VarS4.m() : null;
            bh9 bh9VarS5 = qh9Var.s("ddtags");
            String strM6 = bh9VarS5 != null ? bh9VarS5.m() : null;
            hpe hpeVarM = prk.m(qh9Var.s("session").g());
            bh9 bh9VarS6 = qh9Var.s("source");
            int i2 = 0;
            if (bh9VarS6 != null && (strM = bh9VarS6.m()) != null) {
                int[] iArrH = sq6.H(11);
                ppeVar = null;
                try {
                    int length = iArrH.length;
                    while (i2 < length) {
                        int i3 = iArrH[i2];
                        int i4 = length;
                        if (grc.h(i3).equals(strM)) {
                            i = i3;
                        } else {
                            i2++;
                            length = i4;
                        }
                    }
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                } catch (IllegalStateException e) {
                    e = e;
                    pmf.j("Unable to parse json into type ResourceEvent", e);
                    return ppeVar;
                } catch (NullPointerException e2) {
                    e = e2;
                    pmf.j("Unable to parse json into type ResourceEvent", e);
                    return ppeVar;
                } catch (NumberFormatException e3) {
                    e = e3;
                    pmf.j("Unable to parse json into type ResourceEvent", e);
                    return ppeVar;
                }
            }
            ppeVar = null;
            i = 0;
            ipe ipeVarJ = rrk.j(qh9Var.s("view").g());
            bh9 bh9VarS7 = qh9Var.s("usr");
            mpe mpeVarG = bh9VarS7 != null ? yrk.g(bh9VarS7.g()) : ppeVar;
            bh9 bh9VarS8 = qh9Var.s("account");
            boe boeVarD = bh9VarS8 != null ? fok.d(bh9VarS8.g()) : ppeVar;
            bh9 bh9VarS9 = qh9Var.s("connectivity");
            ioe ioeVarF = bh9VarS9 != null ? yok.f(bh9VarS9.g()) : ppeVar;
            bh9 bh9VarS10 = qh9Var.s("display");
            poe poeVarE = bh9VarS10 != null ? npk.e(bh9VarS10.g()) : ppeVar;
            bh9 bh9VarS11 = qh9Var.s("synthetics");
            lpe lpeVarE = bh9VarS11 != null ? xrk.e(bh9VarS11.g()) : ppeVar;
            bh9 bh9VarS12 = qh9Var.s("ci_test");
            foe foeVarH = bh9VarS12 != null ? pok.h(bh9VarS12.g()) : ppeVar;
            bh9 bh9VarS13 = qh9Var.s("os");
            xoe xoeVarN = bh9VarS13 != null ? ypk.n(bh9VarS13.g()) : ppeVar;
            bh9 bh9VarS14 = qh9Var.s("device");
            ooe ooeVarH = bh9VarS14 != null ? kpk.h(bh9VarS14.g()) : ppeVar;
            moe moeVarG = fpk.g(qh9Var.s("_dd").g());
            bh9 bh9VarS15 = qh9Var.s("context");
            loe loeVarF = bh9VarS15 != null ? dpk.f(bh9VarS15.g()) : ppeVar;
            bh9 bh9VarS16 = qh9Var.s("action");
            coe coeVarG = bh9VarS16 != null ? gok.g(bh9VarS16.g()) : ppeVar;
            bh9 bh9VarS17 = qh9Var.s("container");
            joe joeVarG = bh9VarS17 != null ? zok.g(bh9VarS17.g()) : ppeVar;
            String strM7 = qh9Var.s("type").m();
            gpe gpeVarF = nrk.f(qh9Var.s("resource").g());
            if (x44.r(strM7, "resource")) {
                return new ppe(jK, doeVarH, strM2, strM3, strM4, strM5, strM6, hpeVarM, i, ipeVarJ, mpeVarG, boeVarD, ioeVarF, poeVarE, lpeVarE, foeVarH, xoeVarN, ooeVarH, moeVarG, loeVarF, coeVarG, joeVarG, gpeVarF);
            }
            throw new IllegalStateException("Check failed.");
        } catch (IllegalStateException e4) {
            e = e4;
            ppeVar = null;
        } catch (NullPointerException e5) {
            e = e5;
            ppeVar = null;
        } catch (NumberFormatException e6) {
            e = e6;
            ppeVar = null;
        }
    }

    public static final String d(McpPrompt mcpPrompt) {
        mcpPrompt.getClass();
        String displayName = mcpPrompt.getDisplayName();
        if (displayName != null) {
            if (bsg.I0(displayName)) {
                displayName = null;
            }
            if (displayName != null) {
                return displayName;
            }
        }
        return mcpPrompt.getName();
    }

    public static final String e(McpTool mcpTool) {
        mcpTool.getClass();
        String displayName = mcpTool.getDisplayName();
        if (displayName != null) {
            if (bsg.I0(displayName)) {
                displayName = null;
            }
            if (displayName != null) {
                return displayName;
            }
        }
        return mcpTool.getName();
    }

    public static final ArrayList f(McpServer mcpServer) {
        McpToolUiMeta ui;
        List<McpToolVisibility> visibility;
        mcpServer.getClass();
        List<McpTool> tools = mcpServer.getTools();
        if (tools == null) {
            tools = lm6.E;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : tools) {
            McpTool mcpTool = (McpTool) obj;
            mcpTool.getClass();
            McpToolMeta mcpToolMeta = mcpTool.get_meta();
            if ((mcpToolMeta == null || (ui = mcpToolMeta.getUi()) == null || (visibility = ui.getVisibility()) == null) ? true : visibility.contains(McpToolVisibility.MODEL)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final ArrayList g(McpTool mcpTool) {
        Iterable iterableX;
        mcpTool.getClass();
        McpToolMaxPermission effective_max_permission = mcpTool.getEffective_max_permission();
        int i = effective_max_permission == null ? -1 : s2b.a[effective_max_permission.ordinal()];
        if (i != -1) {
            z4b z4bVar = z4b.G;
            if (i == 1) {
                iterableX = x44.X(z4b.F, z4bVar);
            } else if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        wg6.i();
                        return null;
                    }
                    iterableX = x44.X(z4b.F, z4bVar);
                }
                iterableX = z4b.I;
            } else {
                iterableX = x44.W(z4bVar);
            }
        } else {
            iterableX = z4b.I;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterableX) {
            int iOrdinal = ((z4b) obj).ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        wg6.i();
                        return null;
                    }
                    if (mcpTool.m352getEnabled_keyA4OzCrU() != null) {
                    }
                }
                arrayList.add(obj);
            } else if (mcpTool.m351getAlways_approved_keyA4OzCrU() != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final ArrayList h(McpServer mcpServer) {
        mcpServer.getClass();
        ArrayList arrayListF = f(mcpServer);
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListF) {
            McpTool mcpTool = (McpTool) obj;
            if (mcpTool.m352getEnabled_keyA4OzCrU() != null && !k(mcpTool)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final ArrayList i(McpServer mcpServer) {
        List<McpResource> resources = mcpServer.getResources();
        if (resources == null) {
            resources = lm6.E;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : resources) {
            if (!x44.r(((McpResource) obj).getHidden(), Boolean.TRUE)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final boolean j(McpTool mcpTool) {
        mcpTool.getClass();
        if (mcpTool.m351getAlways_approved_keyA4OzCrU() != null) {
            McpToolMaxPermission effective_max_permission = mcpTool.getEffective_max_permission();
            int i = effective_max_permission == null ? -1 : s2b.a[effective_max_permission.ordinal()];
            if (i != -1) {
                if (i != 1 && i != 2) {
                    if (i != 3 && i != 4) {
                        wg6.i();
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static final boolean k(McpTool mcpTool) {
        mcpTool.getClass();
        return mcpTool.getEffective_max_permission() == McpToolMaxPermission.BLOCKED;
    }

    public static final boolean l(McpServer mcpServer, Map map) {
        map.getClass();
        ArrayList arrayListH = h(mcpServer);
        if (arrayListH.isEmpty()) {
            return false;
        }
        Iterator it = arrayListH.iterator();
        while (it.hasNext()) {
            String strM352getEnabled_keyA4OzCrU = ((McpTool) it.next()).m352getEnabled_keyA4OzCrU();
            if (!x44.r(map.get(strM352getEnabled_keyA4OzCrU != null ? McpToolKey.m1043boximpl(strM352getEnabled_keyA4OzCrU) : null), Boolean.FALSE)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean m(McpServer mcpServer) {
        mcpServer.getClass();
        return mcpServer.getCai_flags().contains(CaiMcpFlag.HIDE_FROM_CONNECTORS_LIST);
    }

    public static final lqa n(McpTool mcpTool, z4b z4bVar) {
        mcpTool.getClass();
        z4bVar.getClass();
        lqa lqaVar = new lqa();
        String strM352getEnabled_keyA4OzCrU = mcpTool.m352getEnabled_keyA4OzCrU();
        if (strM352getEnabled_keyA4OzCrU != null) {
        }
        String strM351getAlways_approved_keyA4OzCrU = mcpTool.m351getAlways_approved_keyA4OzCrU();
        if (strM351getAlways_approved_keyA4OzCrU != null) {
            lqaVar.put(McpToolKey.m1043boximpl(McpToolKey.m1043boximpl(strM351getAlways_approved_keyA4OzCrU).m1050unboximpl()), Boolean.valueOf(z4bVar == z4b.E));
        }
        return lqaVar.c();
    }

    public static final int o(eea eeaVar) {
        byte directionality = Build.VERSION.SDK_INT >= 28 ? Character.getDirectionality(Character.codePointAt(DecimalFormatSymbols.getInstance(eeaVar.a).getDigitStrings()[0], 0)) : Character.getDirectionality(DecimalFormatSymbols.getInstance(eeaVar.a).getZeroDigit());
        return (directionality == 1 || directionality == 2) ? 2 : 1;
    }

    public static final t p(vr vrVar) {
        vrVar.getClass();
        zje zjeVarS = t.s();
        String str = vrVar.b;
        zjeVarS.b();
        t.r((t) zjeVarS.F, str);
        String str2 = vrVar.c.E;
        zjeVarS.b();
        t.p((t) zjeVarS.F, str2);
        String str3 = vrVar.d;
        if (str3 != null) {
            zjeVarS.b();
            t.q((t) zjeVarS.F, str3);
        }
        return (t) zjeVarS.a();
    }

    public static final z4b q(McpTool mcpTool, Map map) {
        Boolean bool;
        mcpTool.getClass();
        map.getClass();
        String strM352getEnabled_keyA4OzCrU = mcpTool.m352getEnabled_keyA4OzCrU();
        z4b z4bVar = z4b.G;
        if (strM352getEnabled_keyA4OzCrU != null) {
            String strM352getEnabled_keyA4OzCrU2 = mcpTool.m352getEnabled_keyA4OzCrU();
            if (x44.r(map.get(strM352getEnabled_keyA4OzCrU2 != null ? McpToolKey.m1043boximpl(strM352getEnabled_keyA4OzCrU2) : null), Boolean.FALSE)) {
                return z4bVar;
            }
        }
        String strM351getAlways_approved_keyA4OzCrU = mcpTool.m351getAlways_approved_keyA4OzCrU();
        z4b z4bVar2 = z4b.F;
        z4b z4bVar3 = z4b.E;
        if (strM351getAlways_approved_keyA4OzCrU != null && (bool = (Boolean) map.get(McpToolKey.m1043boximpl(strM351getAlways_approved_keyA4OzCrU))) != null) {
            return bool.booleanValue() ? z4bVar3 : z4bVar2;
        }
        McpToolMaxPermission default_user_permission = mcpTool.getDefault_user_permission();
        int i = default_user_permission == null ? -1 : s2b.a[default_user_permission.ordinal()];
        if (i != -1 && i != 1) {
            if (i == 2) {
                return z4bVar;
            }
            if (i == 3) {
                return z4bVar3;
            }
            if (i != 4) {
                wg6.i();
                return null;
            }
        }
        return z4bVar2;
    }

    public static int r(int i) {
        if (i == -1) {
            return -1;
        }
        return i / 1000;
    }
}
