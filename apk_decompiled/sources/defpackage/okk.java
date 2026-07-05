package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import androidx.health.platform.client.proto.g;
import com.anthropic.claude.api.account.MemoryMode;
import com.anthropic.claude.api.memory.MemorySettingsResponse;
import com.anthropic.claude.api.project.Project;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.types.a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class okk {
    public static final ta4 a = new ta4(-1899190371, false, new rb4(2));

    public static boolean A(v9i v9iVar) {
        v9iVar.getClass();
        if (v9iVar instanceof u9i) {
            return ((u9i) v9iVar).a() instanceof qqb;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(v9iVar);
        sb.append(", ");
        mr9.q(sq6.t(jce.a, v9iVar.getClass(), sb));
        return false;
    }

    public static boolean B(v9i v9iVar) {
        if (v9iVar instanceof u9i) {
            xh3 xh3VarA = ((u9i) v9iVar).a();
            qqb qqbVar = xh3VarA instanceof qqb ? (qqb) xh3VarA : null;
            return (qqbVar == null || !ssk.m(qqbVar) || qqbVar.m() == 4 || qqbVar.m() == 5) ? false : true;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(v9iVar);
        sb.append(", ");
        mr9.q(sq6.t(jce.a, v9iVar.getClass(), sb));
        return false;
    }

    public static boolean C(v9i v9iVar) {
        v9iVar.getClass();
        if (v9iVar instanceof u9i) {
            return ((u9i) v9iVar).c();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(v9iVar);
        sb.append(", ");
        mr9.q(sq6.t(jce.a, v9iVar.getClass(), sb));
        return false;
    }

    public static boolean D(cs9 cs9Var) {
        cs9Var.getClass();
        if (cs9Var instanceof yr9) {
            return ttj.j((yr9) cs9Var);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(cs9Var);
        sb.append(", ");
        mr9.q(sq6.t(jce.a, cs9Var.getClass(), sb));
        return false;
    }

    public static boolean E(v9i v9iVar) {
        v9iVar.getClass();
        if (v9iVar instanceof u9i) {
            xh3 xh3VarA = ((u9i) v9iVar).a();
            qqb qqbVar = xh3VarA instanceof qqb ? (qqb) xh3VarA : null;
            return (qqbVar != null ? qqbVar.o0() : null) instanceof f39;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(v9iVar);
        sb.append(", ");
        mr9.q(sq6.t(jce.a, v9iVar.getClass(), sb));
        return false;
    }

    public static boolean F(v9i v9iVar) {
        v9iVar.getClass();
        if (v9iVar instanceof u9i) {
            return v9iVar instanceof j79;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(v9iVar);
        sb.append(", ");
        mr9.q(sq6.t(jce.a, v9iVar.getClass(), sb));
        return false;
    }

    public static boolean G(v9i v9iVar) {
        v9iVar.getClass();
        if (v9iVar instanceof u9i) {
            return v9iVar instanceof qa9;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(v9iVar);
        sb.append(", ");
        mr9.q(sq6.t(jce.a, v9iVar.getClass(), sb));
        return false;
    }

    public static boolean H(l7g l7gVar) {
        l7gVar.getClass();
        if (l7gVar instanceof j7g) {
            return ((j7g) l7gVar).b0();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(l7gVar);
        sb.append(", ");
        mr9.q(sq6.t(jce.a, l7gVar.getClass(), sb));
        return false;
    }

    public static boolean I(v9i v9iVar) {
        v9iVar.getClass();
        if (v9iVar instanceof u9i) {
            return or9.G((u9i) v9iVar, okg.b);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(v9iVar);
        sb.append(", ");
        mr9.q(sq6.t(jce.a, v9iVar.getClass(), sb));
        return false;
    }

    public static boolean J(cs9 cs9Var) {
        cs9Var.getClass();
        if (cs9Var instanceof yr9) {
            return fbi.e((yr9) cs9Var);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(cs9Var);
        sb.append(", ");
        mr9.q(sq6.t(jce.a, cs9Var.getClass(), sb));
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean K(l7g l7gVar) {
        if (l7gVar instanceof yr9) {
            return or9.E((yr9) l7gVar);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(l7gVar);
        sb.append(", ");
        mr9.q(sq6.t(jce.a, l7gVar.getClass(), sb));
        return false;
    }

    public static boolean L(lc2 lc2Var) {
        if (lc2Var instanceof i2c) {
            return ((i2c) lc2Var).K;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(lc2Var);
        sb.append(", ");
        mr9.q(sq6.t(jce.a, lc2Var.getClass(), sb));
        return false;
    }

    public static boolean M(vai vaiVar) {
        vaiVar.getClass();
        if (vaiVar instanceof vai) {
            return vaiVar.c();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(vaiVar);
        sb.append(", ");
        mr9.q(sq6.t(jce.a, vaiVar.getClass(), sb));
        return false;
    }

    public static void N(l7g l7gVar) {
        l7gVar.getClass();
        if (l7gVar instanceof j7g) {
            return;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(l7gVar);
        sb.append(", ");
        mr9.q(sq6.t(jce.a, l7gVar.getClass(), sb));
    }

    public static void O(l7g l7gVar) {
        l7gVar.getClass();
        if (l7gVar instanceof j7g) {
            return;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(l7gVar);
        sb.append(", ");
        mr9.q(sq6.t(jce.a, l7gVar.getClass(), sb));
    }

    public static final boolean P(Project project) {
        project.getClass();
        return !z(project);
    }

    public static j7g Q(sn7 sn7Var) {
        if (sn7Var instanceof sn7) {
            return sn7Var.F;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(sn7Var);
        sb.append(", ");
        mr9.q(sq6.t(jce.a, sn7Var.getClass(), sb));
        return null;
    }

    public static fhi R(lc2 lc2Var) {
        if (lc2Var instanceof i2c) {
            return ((i2c) lc2Var).H;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(lc2Var);
        sb.append(", ");
        mr9.q(sq6.t(jce.a, lc2Var.getClass(), sb));
        return null;
    }

    public static fhi S(cs9 cs9Var) {
        if (cs9Var instanceof fhi) {
            return u00.A((fhi) cs9Var);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(cs9Var);
        sb.append(", ");
        mr9.q(sq6.t(jce.a, cs9Var.getClass(), sb));
        return null;
    }

    public static int T(v9i v9iVar) {
        v9iVar.getClass();
        if (v9iVar instanceof u9i) {
            return ((u9i) v9iVar).getParameters().size();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(v9iVar);
        sb.append(", ");
        mr9.q(sq6.t(jce.a, v9iVar.getClass(), sb));
        return 0;
    }

    public static Collection U(wh3 wh3Var, l7g l7gVar) {
        l7gVar.getClass();
        u9i u9iVarQ = wh3Var.Q(l7gVar);
        if (u9iVarQ instanceof j79) {
            return ((j79) u9iVarQ).a;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(l7gVar);
        sb.append(", ");
        mr9.q(sq6.t(jce.a, l7gVar.getClass(), sb));
        return null;
    }

    public static vai V(ic2 ic2Var) {
        ic2Var.getClass();
        if (ic2Var instanceof l2c) {
            return ((l2c) ic2Var).a;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(ic2Var);
        sb.append(", ");
        mr9.q(sq6.t(jce.a, ic2Var.getClass(), sb));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static vh3 W(wh3 wh3Var, l7g l7gVar) {
        if (l7gVar instanceof j7g) {
            yr9 yr9Var = (yr9) l7gVar;
            return new vh3(wh3Var, new a(w9i.b.h(yr9Var.O(), yr9Var.H())));
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(l7gVar);
        sb.append(", ");
        mr9.q(sq6.t(jce.a, l7gVar.getClass(), sb));
        return null;
    }

    public static Collection X(v9i v9iVar) {
        v9iVar.getClass();
        if (v9iVar instanceof u9i) {
            Collection collectionB = ((u9i) v9iVar).b();
            collectionB.getClass();
            return collectionB;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(v9iVar);
        sb.append(", ");
        mr9.q(sq6.t(jce.a, v9iVar.getClass(), sb));
        return null;
    }

    public static l2c Y(lc2 lc2Var) {
        lc2Var.getClass();
        if (lc2Var instanceof i2c) {
            return ((i2c) lc2Var).G;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(lc2Var);
        sb.append(", ");
        mr9.q(sq6.t(jce.a, lc2Var.getClass(), sb));
        return null;
    }

    public static u9i Z(l7g l7gVar) {
        l7gVar.getClass();
        if (l7gVar instanceof j7g) {
            return ((j7g) l7gVar).O();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(l7gVar);
        sb.append(", ");
        mr9.q(sq6.t(jce.a, l7gVar.getClass(), sb));
        return null;
    }

    public static final icb a(MemorySettingsResponse memorySettingsResponse, hcb hcbVar) {
        MemoryMode memory_mode = memorySettingsResponse.getMemory_mode();
        hcb hcbVar2 = hcb.H;
        if (memory_mode == null || memory_mode == MemoryMode.UNKNOWN) {
            Boolean enabled_melange = memorySettingsResponse.getEnabled_melange();
            Boolean bool = Boolean.TRUE;
            if (x44.r(enabled_melange, bool)) {
                hcbVar = hcb.F;
            } else if (x44.r(memorySettingsResponse.getEnabled_saffron(), bool)) {
                hcbVar = hcb.G;
            } else {
                Boolean enabled_melange2 = memorySettingsResponse.getEnabled_melange();
                Boolean bool2 = Boolean.FALSE;
                if (x44.r(enabled_melange2, bool2) && x44.r(memorySettingsResponse.getEnabled_saffron(), bool2)) {
                    hcbVar = hcbVar2;
                }
            }
        } else {
            hcb.E.getClass();
            hcbVar = am4.s(memory_mode);
        }
        return new icb(hcbVar, hcbVar == hcbVar2 && memory_mode != MemoryMode.UNKNOWN);
    }

    public static j7g a0(sn7 sn7Var) {
        if (sn7Var instanceof sn7) {
            return sn7Var.G;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(sn7Var);
        sb.append(", ");
        mr9.q(sq6.t(jce.a, sn7Var.getClass(), sb));
        return null;
    }

    public static final boolean b() {
        if (Build.VERSION.SDK_INT <= 28) {
            return isg.j0(Build.MANUFACTURER, "samsung") || isg.j0(Build.BRAND, "samsung");
        }
        return false;
    }

    public static cs9 b0(wh3 wh3Var, cs9 cs9Var) {
        if (cs9Var instanceof l7g) {
            return wh3Var.F((l7g) cs9Var, true);
        }
        if (cs9Var instanceof sn7) {
            sn7 sn7Var = (sn7) cs9Var;
            return wh3Var.r0(wh3Var.F(wh3Var.x(sn7Var), true), wh3Var.F(wh3Var.r(sn7Var), true));
        }
        sz6.j("sealed");
        return null;
    }

    public static boolean c(v9i v9iVar, v9i v9iVar2) {
        v9iVar.getClass();
        v9iVar2.getClass();
        if (!(v9iVar instanceof u9i)) {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(v9iVar);
            sb.append(", ");
            mr9.q(sq6.t(jce.a, v9iVar.getClass(), sb));
            return false;
        }
        if (v9iVar2 instanceof u9i) {
            return v9iVar.equals(v9iVar2);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(v9iVar2);
        sb2.append(", ");
        mr9.q(sq6.t(jce.a, v9iVar2.getClass(), sb2));
        return false;
    }

    public static j7g c0(l7g l7gVar, boolean z) {
        l7gVar.getClass();
        if (l7gVar instanceof j7g) {
            return ((j7g) l7gVar).l0(z);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(l7gVar);
        sb.append(", ");
        mr9.q(sq6.t(jce.a, l7gVar.getClass(), sb));
        return null;
    }

    public static int d(cs9 cs9Var) {
        cs9Var.getClass();
        if (cs9Var instanceof yr9) {
            return ((yr9) cs9Var).H().size();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(cs9Var);
        sb.append(", ");
        mr9.q(sq6.t(jce.a, cs9Var.getClass(), sb));
        return 0;
    }

    public static q9i e(l7g l7gVar) {
        l7gVar.getClass();
        if (l7gVar instanceof j7g) {
            return (q9i) l7gVar;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(l7gVar);
        sb.append(", ");
        mr9.q(sq6.t(jce.a, l7gVar.getClass(), sb));
        return null;
    }

    public static lc2 f(wh3 wh3Var, l7g l7gVar) {
        l7gVar.getClass();
        if (l7gVar instanceof j7g) {
            if (l7gVar instanceof n7g) {
                return wh3Var.S(((n7g) l7gVar).F);
            }
            if (l7gVar instanceof i2c) {
                return (i2c) l7gVar;
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(l7gVar);
        sb.append(", ");
        mr9.q(sq6.t(jce.a, l7gVar.getClass(), sb));
        return null;
    }

    public static fw5 g(l7g l7gVar) {
        l7gVar.getClass();
        if (l7gVar instanceof j7g) {
            if (l7gVar instanceof fw5) {
                return (fw5) l7gVar;
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(l7gVar);
        sb.append(", ");
        mr9.q(sq6.t(jce.a, l7gVar.getClass(), sb));
        return null;
    }

    public static sn7 h(cs9 cs9Var) {
        cs9Var.getClass();
        if (cs9Var instanceof yr9) {
            fhi fhiVarK0 = ((yr9) cs9Var).k0();
            if (fhiVarK0 instanceof sn7) {
                return (sn7) fhiVarK0;
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(cs9Var);
        sb.append(", ");
        mr9.q(sq6.t(jce.a, cs9Var.getClass(), sb));
        return null;
    }

    public static j7g i(cs9 cs9Var) {
        cs9Var.getClass();
        if (cs9Var instanceof yr9) {
            fhi fhiVarK0 = ((yr9) cs9Var).k0();
            if (fhiVarK0 instanceof j7g) {
                return (j7g) fhiVarK0;
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(cs9Var);
        sb.append(", ");
        mr9.q(sq6.t(jce.a, cs9Var.getClass(), sb));
        return null;
    }

    public static wai j(cs9 cs9Var) {
        cs9Var.getClass();
        if (cs9Var instanceof yr9) {
            return new wai(1, (yr9) cs9Var);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(cs9Var);
        sb.append(", ");
        mr9.q(sq6.t(jce.a, cs9Var.getClass(), sb));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.j7g k(defpackage.l7g r15) {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.okk.k(l7g):j7g");
    }

    public static int l(lc2 lc2Var) {
        if (lc2Var instanceof i2c) {
            return ((i2c) lc2Var).F;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(lc2Var);
        sb.append(", ");
        mr9.q(sq6.t(jce.a, lc2Var.getClass(), sb));
        return 0;
    }

    public static fhi m(wh3 wh3Var, l7g l7gVar, l7g l7gVar2) {
        l7gVar.getClass();
        l7gVar2.getClass();
        if (!(l7gVar instanceof j7g)) {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(wh3Var);
            sb.append(", ");
            mr9.q(sq6.t(jce.a, wh3Var.getClass(), sb));
            return null;
        }
        if (l7gVar2 instanceof j7g) {
            return yfd.z((j7g) l7gVar, (j7g) l7gVar2);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(wh3Var);
        sb2.append(", ");
        mr9.q(sq6.t(jce.a, wh3Var.getClass(), sb2));
        return null;
    }

    public static yl4 n(qh9 qh9Var) {
        try {
            if (qh9Var.s("format_version").k() == 2) {
                return new yl4();
            }
            throw new IllegalStateException("Check failed.");
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type Dd", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type Dd", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type Dd", e3);
            return null;
        }
    }

    public static vai o(cs9 cs9Var, int i) {
        cs9Var.getClass();
        if (cs9Var instanceof yr9) {
            return (vai) ((yr9) cs9Var).H().get(i);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(cs9Var);
        sb.append(", ");
        mr9.q(sq6.t(jce.a, cs9Var.getClass(), sb));
        return null;
    }

    public static qai p(v9i v9iVar, int i) {
        v9iVar.getClass();
        if (v9iVar instanceof u9i) {
            Object obj = ((u9i) v9iVar).getParameters().get(i);
            obj.getClass();
            return (qai) obj;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(v9iVar);
        sb.append(", ");
        mr9.q(sq6.t(jce.a, v9iVar.getClass(), sb));
        return null;
    }

    public static r9e q(Context context, AttributeSet attributeSet, int i, int i2) {
        r9e r9eVar = new r9e();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r0e.a, i, i2);
        r9eVar.a = typedArrayObtainStyledAttributes.getInt(0, 1);
        r9eVar.b = typedArrayObtainStyledAttributes.getInt(10, 1);
        r9eVar.c = typedArrayObtainStyledAttributes.getBoolean(9, false);
        r9eVar.d = typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.recycle();
        return r9eVar;
    }

    public static String r(int i) {
        switch (i) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 1:
            case 9:
            case 11:
            case 12:
            default:
                return ij0.g(i, "unknown status code: ", new StringBuilder(String.valueOf(i).length() + 21));
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 10:
                return "DEVELOPER_ERROR";
            case 13:
                return "ERROR";
            case 14:
                return "INTERRUPTED";
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return "TIMEOUT";
            case 16:
                return "CANCELED";
            case g.MAX_FIELD_NUMBER /* 17 */:
                return "API_NOT_CONNECTED";
            case g.AVG_FIELD_NUMBER /* 18 */:
                return "DEAD_CLIENT";
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return "REMOTE_EXCEPTION";
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return "CONNECTION_SUSPENDED_DURING_CALL";
            case 21:
                return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return "RECONNECTION_TIMED_OUT";
        }
    }

    public static fhi s(vai vaiVar) {
        vaiVar.getClass();
        if (vaiVar instanceof vai) {
            return vaiVar.b().k0();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(vaiVar);
        sb.append(", ");
        mr9.q(sq6.t(jce.a, vaiVar.getClass(), sb));
        return null;
    }

    public static qai t(v9i v9iVar) {
        v9iVar.getClass();
        if (v9iVar instanceof u9i) {
            xh3 xh3VarA = ((u9i) v9iVar).a();
            if (xh3VarA instanceof qai) {
                return (qai) xh3VarA;
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(v9iVar);
        sb.append(", ");
        mr9.q(sq6.t(jce.a, v9iVar.getClass(), sb));
        return null;
    }

    public static int u(vai vaiVar) {
        vaiVar.getClass();
        if (vaiVar instanceof vai) {
            int iA = vaiVar.a();
            if (iA != 0) {
                return gwk.n(iA);
            }
            throw null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(vaiVar);
        sb.append(", ");
        mr9.q(sq6.t(jce.a, vaiVar.getClass(), sb));
        return 0;
    }

    public static boolean v(cs9 cs9Var, ww7 ww7Var) {
        cs9Var.getClass();
        ww7Var.getClass();
        if (cs9Var instanceof yr9) {
            return ((yr9) cs9Var).getAnnotations().x(ww7Var);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(cs9Var);
        sb.append(", ");
        mr9.q(sq6.t(jce.a, cs9Var.getClass(), sb));
        return false;
    }

    public static boolean w(qai qaiVar, v9i v9iVar) {
        if (v9iVar == null ? true : v9iVar instanceof u9i) {
            return jwk.z(qaiVar, (u9i) v9iVar, null);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(qaiVar);
        sb.append(", ");
        mr9.q(sq6.t(jce.a, qaiVar.getClass(), sb));
        return false;
    }

    public static boolean x(l7g l7gVar, l7g l7gVar2) {
        l7gVar.getClass();
        l7gVar2.getClass();
        if (!(l7gVar instanceof j7g)) {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(l7gVar);
            sb.append(", ");
            mr9.q(sq6.t(jce.a, l7gVar.getClass(), sb));
            return false;
        }
        if (l7gVar2 instanceof j7g) {
            return ((j7g) l7gVar).H() == ((j7g) l7gVar2).H();
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(l7gVar2);
        sb2.append(", ");
        mr9.q(sq6.t(jce.a, l7gVar2.getClass(), sb2));
        return false;
    }

    public static boolean y(v9i v9iVar) {
        v9iVar.getClass();
        if (v9iVar instanceof u9i) {
            return or9.G((u9i) v9iVar, okg.a);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(v9iVar);
        sb.append(", ");
        mr9.q(sq6.t(jce.a, v9iVar.getClass(), sb));
        return false;
    }

    public static final boolean z(Project project) {
        project.getClass();
        return project.getArchived_at() != null;
    }
}
