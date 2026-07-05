package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.RemoteViews;
import com.anthropic.claude.R;
import io.sentry.e0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class cw9 {
    public static final Map a = sta.h0(new cpc(gw9.H, Integer.valueOf(R.layout.glance_text)), new cpc(gw9.I, Integer.valueOf(R.layout.glance_list)), new cpc(gw9.J, Integer.valueOf(R.layout.glance_check_box)), new cpc(gw9.K, Integer.valueOf(R.layout.glance_check_box_backport)), new cpc(gw9.L, Integer.valueOf(R.layout.glance_button)), new cpc(gw9.V, Integer.valueOf(R.layout.glance_swtch)), new cpc(gw9.W, Integer.valueOf(R.layout.glance_swtch_backport)), new cpc(gw9.M, Integer.valueOf(R.layout.glance_frame)), new cpc(gw9.X, Integer.valueOf(R.layout.glance_image_crop)), new cpc(gw9.a0, Integer.valueOf(R.layout.glance_image_crop_decorative)), new cpc(gw9.Y, Integer.valueOf(R.layout.glance_image_fit)), new cpc(gw9.b0, Integer.valueOf(R.layout.glance_image_fit_decorative)), new cpc(gw9.Z, Integer.valueOf(R.layout.glance_image_fill_bounds)), new cpc(gw9.c0, Integer.valueOf(R.layout.glance_image_fill_bounds_decorative)), new cpc(gw9.N, Integer.valueOf(R.layout.glance_linear_progress_indicator)), new cpc(gw9.O, Integer.valueOf(R.layout.glance_circular_progress_indicator)), new cpc(gw9.P, Integer.valueOf(R.layout.glance_vertical_grid_one_column)), new cpc(gw9.Q, Integer.valueOf(R.layout.glance_vertical_grid_two_columns)), new cpc(gw9.R, Integer.valueOf(R.layout.glance_vertical_grid_three_columns)), new cpc(gw9.S, Integer.valueOf(R.layout.glance_vertical_grid_four_columns)), new cpc(gw9.T, Integer.valueOf(R.layout.glance_vertical_grid_five_columns)), new cpc(gw9.U, Integer.valueOf(R.layout.glance_vertical_grid_auto_fit)), new cpc(gw9.d0, Integer.valueOf(R.layout.glance_radio_button)), new cpc(gw9.e0, Integer.valueOf(R.layout.glance_radio_button_backport)));
    public static final int b;
    public static final int c;

    static {
        int size = y18.f.size();
        b = size;
        c = Build.VERSION.SDK_INT >= 31 ? y18.h : y18.h / size;
    }

    public static final ife a(f6i f6iVar, q68 q68Var, int i) {
        Map mapSingletonMap;
        Context context = f6iVar.a;
        Integer numValueOf = Integer.valueOf(R.id.rootStubId);
        int i2 = Build.VERSION.SDK_INT;
        dw9 dw9Var = dw9.E;
        if (i2 >= 31) {
            int i3 = y18.h;
            if (i >= i3) {
                mr9.q(grc.o(i3, i, "Index of the root view cannot be more than ", ", currently "));
                return null;
            }
            z8g z8gVar = new z8g(dw9Var, dw9Var);
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), y18.g + i);
            gaj gajVar = (gaj) q68Var.a(bw9.H, null);
            if (gajVar != null) {
                psk.h(remoteViews, gajVar, R.id.rootView);
            }
            km8 km8Var = (km8) q68Var.a(bw9.I, null);
            if (km8Var != null) {
                psk.g(remoteViews, km8Var, R.id.rootView);
            }
            if (i2 >= 33) {
                remoteViews.removeAllViews(R.id.rootView);
            }
            if (i2 >= 33) {
                mapSingletonMap = nm6.E;
            } else {
                Map mapSingletonMap2 = Collections.singletonMap(z8gVar, numValueOf);
                mapSingletonMap2.getClass();
                mapSingletonMap = Collections.singletonMap(0, mapSingletonMap2);
                mapSingletonMap.getClass();
            }
            return new ife(remoteViews, new c59(R.id.rootView, 0, mapSingletonMap, 2));
        }
        int i4 = b * i;
        int i5 = y18.h;
        if (i4 >= i5) {
            throw new IllegalArgumentException(("Index of the root view cannot be more than " + (i5 / 4) + ", currently " + i).toString());
        }
        gaj gajVar2 = (gaj) q68Var.a(bw9.F, null);
        w46 w46Var = u46.a;
        w46 w46Var2 = gajVar2 != null ? gajVar2.a : w46Var;
        km8 km8Var2 = (km8) q68Var.a(bw9.G, null);
        if (km8Var2 != null) {
            w46Var = km8Var2.a;
        }
        p46 p46Var = p46.a;
        boolean zEquals = w46Var2.equals(p46Var);
        dw9 dw9Var2 = dw9.H;
        dw9 dw9Var3 = zEquals ? dw9Var2 : dw9Var;
        if (!w46Var.equals(p46Var)) {
            dw9Var2 = dw9Var;
        }
        dw9 dw9Var4 = dw9.F;
        dw9 dw9Var5 = dw9Var3 == dw9Var4 ? dw9Var : dw9Var3;
        if (dw9Var2 != dw9Var4) {
            dw9Var = dw9Var2;
        }
        z8g z8gVar2 = new z8g(dw9Var5, dw9Var);
        Integer num = (Integer) y18.f.get(z8gVar2);
        if (num != null) {
            RemoteViews remoteViews2 = new RemoteViews(context.getPackageName(), i4 + y18.g + num.intValue());
            Map mapSingletonMap3 = Collections.singletonMap(z8gVar2, numValueOf);
            mapSingletonMap3.getClass();
            Map mapSingletonMap4 = Collections.singletonMap(0, mapSingletonMap3);
            mapSingletonMap4.getClass();
            return new ife(remoteViews2, new c59(0, 0, mapSingletonMap4, 3));
        }
        throw new IllegalStateException("Cannot find root element for size [" + dw9Var3 + ", " + dw9Var2 + ']');
    }

    public static final c59 b(RemoteViews remoteViews, f6i f6iVar, gw9 gw9Var, int i, q68 q68Var, pt ptVar, rt rtVar) {
        int iIntValue;
        if (i > 10) {
            Log.e("GlanceAppWidget", "Truncated " + gw9Var + " container from " + i + " to 10 elements", new IllegalArgumentException(gw9Var + " container cannot have more than 10 elements"));
        }
        int i2 = i <= 10 ? i : 10;
        Integer numF = f(gw9Var, q68Var);
        if (numF != null) {
            iIntValue = numF.intValue();
        } else {
            wm4 wm4Var = (wm4) y18.a.get(new xm4(gw9Var, i2, ptVar, rtVar));
            Integer numValueOf = wm4Var != null ? Integer.valueOf(wm4Var.a) : null;
            if (numValueOf == null) {
                throw new IllegalArgumentException("Cannot find container " + gw9Var + " with " + i + " children");
            }
            iIntValue = numValueOf.intValue();
        }
        Map map = (Map) y18.b.get(gw9Var);
        if (map == null) {
            xh6.k("Cannot find generated children for ", gw9Var);
            return null;
        }
        c59 c59VarD = d(remoteViews, f6iVar, iIntValue, q68Var);
        int i3 = c59VarD.a;
        c59 c59Var = new c59(i3, c59VarD.b, map);
        if (Build.VERSION.SDK_INT >= 33) {
            remoteViews.removeAllViews(i3);
        }
        return c59Var;
    }

    public static final c59 c(RemoteViews remoteViews, f6i f6iVar, gw9 gw9Var, q68 q68Var) {
        Integer numF = f(gw9Var, q68Var);
        if (numF != null || (numF = (Integer) a.get(gw9Var)) != null) {
            return d(remoteViews, f6iVar, numF.intValue(), q68Var);
        }
        xh6.k("Cannot use `insertView` with a container like ", gw9Var);
        return null;
    }

    public static final c59 d(RemoteViews remoteViews, f6i f6iVar, int i, q68 q68Var) {
        Integer numValueOf;
        int iIntValue;
        int i2 = f6iVar.e;
        gaj gajVar = (gaj) q68Var.a(bw9.J, null);
        w46 w46Var = u46.a;
        w46 w46Var2 = gajVar != null ? gajVar.a : w46Var;
        km8 km8Var = (km8) q68Var.a(bw9.K, null);
        if (km8Var != null) {
            w46Var = km8Var.a;
        }
        if (q68Var.c(new e69(6))) {
            numValueOf = null;
        } else {
            if (f6iVar.i.getAndSet(true)) {
                sz6.j("At most one view can be set as AppWidgetBackground.");
                return null;
            }
            numValueOf = Integer.valueOf(android.R.id.background);
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 33) {
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
            } else {
                int iIncrementAndGet = f6iVar.g.incrementAndGet();
                if (iIncrementAndGet >= y18.j) {
                    sz6.j("There are too many views");
                    return null;
                }
                iIntValue = iIncrementAndGet + y18.i;
            }
            RemoteViews remoteViewsJ = oe0.j(i, iIntValue, f6iVar.a.getPackageName());
            int i4 = f6iVar.h.a;
            if (i3 >= 31) {
                oe0.a(remoteViews, i4, remoteViewsJ, i2);
            } else {
                remoteViews.addView(i4, remoteViewsJ);
            }
            return new c59(iIntValue, 0, null, 6);
        }
        if (i3 >= 31) {
            o46 o46Var = o46.a;
            boolean zEquals = w46Var2.equals(o46Var);
            dw9 dw9Var = dw9.E;
            dw9 dw9Var2 = dw9.G;
            dw9 dw9Var3 = zEquals ? dw9Var2 : dw9Var;
            if (w46Var.equals(o46Var)) {
                dw9Var = dw9Var2;
            }
            return new c59(puj.h(remoteViews, f6iVar, e(remoteViews, f6iVar, i2, dw9Var3, dw9Var), i, numValueOf), 0, null, 6);
        }
        dw9 dw9VarG = g(w46Var2);
        dw9 dw9VarG2 = g(w46Var);
        int iE = e(remoteViews, f6iVar, i2, dw9VarG, dw9VarG2);
        dw9 dw9Var4 = dw9.F;
        if (dw9VarG != dw9Var4 && dw9VarG2 != dw9Var4) {
            return new c59(puj.h(remoteViews, f6iVar, iE, i, numValueOf), 0, null, 6);
        }
        ku9 ku9Var = (ku9) y18.e.get(new z8g(dw9VarG, dw9VarG2));
        if (ku9Var != null) {
            return new c59(puj.h(remoteViews, f6iVar, R.id.glanceViewStub, i, numValueOf), puj.h(remoteViews, f6iVar, iE, ku9Var.a, null), null, 4);
        }
        pmf.i("Could not find complex layout for width=", dw9VarG, ", height=", dw9VarG2);
        return null;
    }

    public static final int e(RemoteViews remoteViews, f6i f6iVar, int i, dw9 dw9Var, dw9 dw9Var2) {
        dw9 dw9Var3 = dw9.E;
        dw9 dw9Var4 = dw9.F;
        dw9 dw9Var5 = dw9Var == dw9Var4 ? dw9Var3 : dw9Var;
        if (dw9Var2 != dw9Var4) {
            dw9Var3 = dw9Var2;
        }
        z8g z8gVar = new z8g(dw9Var5, dw9Var3);
        Map map = (Map) f6iVar.h.c.get(Integer.valueOf(i));
        if (map == null) {
            sz6.j(grc.p(i, "Parent doesn't have child position "));
            return 0;
        }
        Integer num = (Integer) map.get(z8gVar);
        if (num == null) {
            throw new IllegalStateException("No child for position " + i + " and size " + dw9Var + " x " + dw9Var2);
        }
        int iIntValue = num.intValue();
        Collection collectionValues = map.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (((Number) obj).intValue() != iIntValue) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            puj.h(remoteViews, f6iVar, ((Number) it.next()).intValue(), R.layout.glance_deleted_view, Integer.valueOf(R.id.deletedViewId));
        }
        return iIntValue;
    }

    public static final Integer f(gw9 gw9Var, q68 q68Var) {
        if (Build.VERSION.SDK_INT >= 33) {
            bu buVar = (bu) q68Var.a(bw9.L, null);
            gaj gajVar = (gaj) q68Var.a(bw9.M, null);
            o46 o46Var = o46.a;
            boolean zEquals = gajVar != null ? gajVar.a.equals(o46Var) : false;
            km8 km8Var = (km8) q68Var.a(bw9.N, null);
            boolean zEquals2 = km8Var != null ? km8Var.a.equals(o46Var) : false;
            if (buVar != null) {
                st stVar = buVar.a;
                ku9 ku9Var = (ku9) y18.c.get(new zv1(gw9Var, stVar.a, stVar.b));
                if (ku9Var != null) {
                    return Integer.valueOf(ku9Var.a);
                }
                pmf.i("Cannot find ", gw9Var, " with alignment ", stVar);
                return null;
            }
            if (zEquals || zEquals2) {
                ku9 ku9Var2 = (ku9) y18.d.get(new wwe(gw9Var, zEquals, zEquals2));
                if (ku9Var2 != null) {
                    return Integer.valueOf(ku9Var2.a);
                }
                e0.d(gw9Var, " with defaultWeight set", "Cannot find ");
                return null;
            }
        }
        return null;
    }

    public static final dw9 g(w46 w46Var) {
        if (w46Var instanceof u46) {
            return dw9.E;
        }
        if (w46Var instanceof o46) {
            return dw9.G;
        }
        if (w46Var instanceof p46) {
            return dw9.H;
        }
        if (w46Var instanceof n46) {
            return dw9.F;
        }
        wg6.i();
        return null;
    }
}
