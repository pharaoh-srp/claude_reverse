package defpackage;

import com.google.gson.JsonParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class sh9 implements s16 {
    public final /* synthetic */ int E;
    public final h99 F;

    public sh9(h99 h99Var, int i) {
        this.E = i;
        h99Var.getClass();
        switch (i) {
            case 1:
                this.F = h99Var;
                break;
            default:
                this.F = h99Var;
                break;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static Object b(qh9 qh9Var, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        if (str != null) {
            switch (str.hashCode()) {
                case -1422950858:
                    if (str.equals("action")) {
                        return dch.u(qh9Var);
                    }
                    break;
                case -341064690:
                    if (str.equals("resource")) {
                        return qok.c(qh9Var);
                    }
                    break;
                case 3619493:
                    if (str.equals("view")) {
                        return ycj.a(qh9Var);
                    }
                    break;
                case 96784904:
                    if (str.equals("error")) {
                        return rwj.j(qh9Var);
                    }
                    break;
                case 128111976:
                    if (str.equals("long_task")) {
                        return tik.i(qh9Var);
                    }
                    break;
                case 780346297:
                    if (str.equals("telemetry")) {
                        String strM = ((vh9) ((qh9) qh9Var.E.get("telemetry")).E.get("status")).m();
                        if (x44.r(strM, "debug")) {
                            try {
                                yl4 yl4VarN = okk.n(qh9Var.s("_dd").g());
                                String strM2 = qh9Var.s("type").m();
                                long jK = qh9Var.s("date").k();
                                String strM3 = qh9Var.s("service").m();
                                String strM4 = qh9Var.s("source").m();
                                strM4.getClass();
                                int[] iArrH = sq6.H(10);
                                int length = iArrH.length;
                                int i = 0;
                                while (i < length) {
                                    int i2 = iArrH[i];
                                    int[] iArr = iArrH;
                                    if (ebh.c(i2).equals(strM4)) {
                                        String strM5 = qh9Var.s("version").m();
                                        bh9 bh9VarS = qh9Var.s("application");
                                        kbh kbhVarC = bh9VarS != null ? nkk.c(bh9VarS.g()) : null;
                                        bh9 bh9VarS2 = qh9Var.s("session");
                                        nbh nbhVarF = bh9VarS2 != null ? xkk.f(bh9VarS2.g()) : null;
                                        bh9 bh9VarS3 = qh9Var.s("view");
                                        pbh pbhVarG = bh9VarS3 != null ? blk.g(bh9VarS3.g()) : null;
                                        bh9 bh9VarS4 = qh9Var.s("action");
                                        jbh jbhVarG = bh9VarS4 != null ? mkk.g(bh9VarS4.g()) : null;
                                        bh9 bh9VarS5 = qh9Var.s("effective_sample_rate");
                                        Number numberL = bh9VarS5 != null ? bh9VarS5.l() : null;
                                        bh9 bh9VarS6 = qh9Var.s("experimental_features");
                                        if (bh9VarS6 != null) {
                                            ArrayList arrayList3 = bh9VarS6.e().E;
                                            ArrayList arrayList4 = new ArrayList(arrayList3.size());
                                            Iterator it = arrayList3.iterator();
                                            while (it.hasNext()) {
                                                arrayList4.add(((bh9) it.next()).m());
                                            }
                                            arrayList2 = arrayList4;
                                        } else {
                                            arrayList2 = null;
                                        }
                                        obh obhVarI = ykk.i(qh9Var.s("telemetry").g());
                                        if (!x44.r(strM2, "telemetry")) {
                                            throw new IllegalStateException("Check failed.");
                                        }
                                        strM3.getClass();
                                        strM5.getClass();
                                        return new qbh(yl4VarN, jK, strM3, i2, strM5, kbhVarC, nbhVarF, pbhVarG, jbhVarG, numberL, arrayList2, obhVarI);
                                    }
                                    i++;
                                    iArrH = iArr;
                                }
                                throw new NoSuchElementException("Array contains no element matching the predicate.");
                            } catch (IllegalStateException e) {
                                pmf.j("Unable to parse json into type TelemetryDebugEvent", e);
                                return null;
                            } catch (NullPointerException e2) {
                                pmf.j("Unable to parse json into type TelemetryDebugEvent", e2);
                                return null;
                            } catch (NumberFormatException e3) {
                                pmf.j("Unable to parse json into type TelemetryDebugEvent", e3);
                                return null;
                            }
                        }
                        if (!x44.r(strM, "error")) {
                            throw new JsonParseException(ij0.i("We could not deserialize the telemetry event with status: ", strM));
                        }
                        try {
                            am4 am4VarI = flk.i(qh9Var.s("_dd").g());
                            String strM6 = qh9Var.s("type").m();
                            long jK2 = qh9Var.s("date").k();
                            String strM7 = qh9Var.s("service").m();
                            String strM8 = qh9Var.s("source").m();
                            strM8.getClass();
                            for (int i3 : sq6.H(10)) {
                                if (gid.m(i3).equals(strM8)) {
                                    String strM9 = qh9Var.s("version").m();
                                    bh9 bh9VarS7 = qh9Var.s("application");
                                    sbh sbhVarE = bh9VarS7 != null ? elk.e(bh9VarS7.g()) : null;
                                    bh9 bh9VarS8 = qh9Var.s("session");
                                    wbh wbhVarE = bh9VarS8 != null ? ulk.e(bh9VarS8.g()) : null;
                                    bh9 bh9VarS9 = qh9Var.s("view");
                                    ybh ybhVarE = bh9VarS9 != null ? zlk.e(bh9VarS9.g()) : null;
                                    bh9 bh9VarS10 = qh9Var.s("action");
                                    rbh rbhVarM = bh9VarS10 != null ? dlk.m(bh9VarS10.g()) : null;
                                    bh9 bh9VarS11 = qh9Var.s("effective_sample_rate");
                                    Number numberL2 = bh9VarS11 != null ? bh9VarS11.l() : null;
                                    bh9 bh9VarS12 = qh9Var.s("experimental_features");
                                    if (bh9VarS12 != null) {
                                        ArrayList arrayList5 = bh9VarS12.e().E;
                                        ArrayList arrayList6 = new ArrayList(arrayList5.size());
                                        Iterator it2 = arrayList5.iterator();
                                        while (it2.hasNext()) {
                                            arrayList6.add(((bh9) it2.next()).m());
                                        }
                                        arrayList = arrayList6;
                                    } else {
                                        arrayList = null;
                                    }
                                    xbh xbhVarG = vlk.g(qh9Var.s("telemetry").g());
                                    if (!x44.r(strM6, "telemetry")) {
                                        throw new IllegalStateException("Check failed.");
                                    }
                                    strM7.getClass();
                                    strM9.getClass();
                                    return new zbh(am4VarI, jK2, strM7, i3, strM9, sbhVarE, wbhVarE, ybhVarE, rbhVarM, numberL2, arrayList, xbhVarG);
                                }
                            }
                            throw new NoSuchElementException("Array contains no element matching the predicate.");
                        } catch (IllegalStateException e4) {
                            pmf.j("Unable to parse json into type TelemetryErrorEvent", e4);
                            return null;
                        } catch (NullPointerException e5) {
                            pmf.j("Unable to parse json into type TelemetryErrorEvent", e5);
                            return null;
                        } catch (NumberFormatException e6) {
                            pmf.j("Unable to parse json into type TelemetryErrorEvent", e6);
                            return null;
                        }
                    }
                    break;
            }
        }
        throw new JsonParseException(ij0.i("We could not deserialize the event with type: ", str));
    }

    public qh9 a(String str) {
        g99 g99Var = g99.G;
        g99 g99Var2 = g99.F;
        str.getClass();
        try {
            return v40.J(str).g();
        } catch (JsonParseException e) {
            dch.I(this.F, 5, x44.X(g99Var2, g99Var), new rb1(str, 15), e, 48);
            return null;
        } catch (IllegalStateException e2) {
            dch.I(this.F, 5, x44.X(g99Var2, g99Var), new rb1(str, 16), e2, 48);
            return null;
        }
    }

    @Override // defpackage.s16
    public final Object r(Object obj) {
        switch (this.E) {
            case 0:
                return a((String) obj);
            default:
                qh9 qh9Var = (qh9) obj;
                g99 g99Var = g99.G;
                g99 g99Var2 = g99.F;
                qh9Var.getClass();
                try {
                    vh9 vh9Var = (vh9) qh9Var.E.get("type");
                    return b(qh9Var, vh9Var != null ? vh9Var.m() : null);
                } catch (JsonParseException e) {
                    dch.I(this.F, 5, x44.X(g99Var2, g99Var), new txe(qh9Var, 0), e, 48);
                    return null;
                } catch (IllegalStateException e2) {
                    dch.I(this.F, 5, x44.X(g99Var2, g99Var), new txe(qh9Var, 1), e2, 48);
                    return null;
                }
        }
    }
}
