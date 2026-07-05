package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.ui.platform.AndroidComposeView;
import com.anthropic.claude.R;
import com.pvporbit.freetype.FreeTypeConstants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class hd4 {
    public final View a;
    public final ge4 b;
    public final m4a c;
    public final u5f d;
    public final eyi e;
    public final sy8 f;
    public final rpe g;
    public final Configuration h;
    public final nwb i;
    public final bz j;
    public final b70 k;
    public final nz l;
    public final mz m;
    public final rt7 n;
    public final nwb o;
    public final gf8 p;
    public final e70 q;
    public final cv9 r;
    public final y1a s;
    public final jb2 t;
    public int u;
    public final l4 v;
    public final gd4 w;

    public hd4(hd4 hd4Var, View view, ge4 ge4Var, m4a m4aVar, u5f u5fVar, eyi eyiVar) {
        sy8 sy8Var;
        Configuration configuration;
        nwb nwbVarP;
        bz bzVar;
        b70 b70Var;
        nz nzVar;
        mz mzVar;
        rt7 dd8Var;
        nwb lscVar;
        e70 e70Var;
        jb2 jb2Var;
        cv9 cv9Var;
        rpe rpeVar;
        View view2;
        boolean zR = x44.r((hd4Var == null || (view2 = hd4Var.a) == null) ? null : view2.getContext(), view.getContext());
        this.a = view;
        this.b = ge4Var;
        this.c = m4aVar;
        this.d = u5fVar;
        this.e = eyiVar;
        if (zR) {
            hd4Var.getClass();
            sy8Var = hd4Var.f;
        } else {
            sy8Var = new sy8();
        }
        this.f = sy8Var;
        this.g = (hd4Var == null || (rpeVar = hd4Var.g) == null) ? new rpe() : rpeVar;
        if (zR) {
            hd4Var.getClass();
            configuration = hd4Var.h;
        } else {
            configuration = new Configuration(view.getContext().getResources().getConfiguration());
        }
        this.h = configuration;
        if (zR) {
            hd4Var.getClass();
            nwbVarP = hd4Var.i;
        } else {
            nwbVarP = mpk.P(new Configuration(configuration));
        }
        this.i = nwbVarP;
        if (zR) {
            hd4Var.getClass();
            bzVar = hd4Var.j;
        } else {
            bzVar = new bz(view.getContext());
        }
        this.j = bzVar;
        if (zR) {
            hd4Var.getClass();
            b70Var = hd4Var.k;
        } else {
            b70Var = new b70(view.getContext());
        }
        this.k = b70Var;
        if (zR) {
            hd4Var.getClass();
            nzVar = hd4Var.l;
        } else {
            nzVar = new nz(view.getContext());
        }
        this.l = nzVar;
        if (zR) {
            hd4Var.getClass();
            mzVar = hd4Var.m;
        } else {
            mzVar = new mz(nzVar);
        }
        this.m = mzVar;
        if (zR) {
            hd4Var.getClass();
            dd8Var = hd4Var.n;
        } else {
            view.getContext();
            dd8Var = new dd8(12);
        }
        this.n = dd8Var;
        if (zR) {
            hd4Var.getClass();
            lscVar = hd4Var.o;
        } else {
            lscVar = new lsc(wd6.j0(view.getContext()), zp3.X);
        }
        this.o = lscVar;
        this.p = view == (hd4Var != null ? hd4Var.a : null) ? hd4Var.p : new z4d(view);
        if (zR) {
            hd4Var.getClass();
            e70Var = hd4Var.q;
        } else {
            e70Var = new e70(ViewConfiguration.get(view.getContext()));
        }
        this.q = e70Var;
        this.r = (hd4Var == null || (cv9Var = hd4Var.r) == null) ? new cv9() : cv9Var;
        this.s = new y1a();
        this.t = (hd4Var == null || (jb2Var = hd4Var.t) == null) ? new jb2() : jb2Var;
        this.v = new l4(7, this);
        this.w = new gd4(this);
    }

    public final void a(AndroidComposeView androidComposeView, pz7 pz7Var, ld4 ld4Var, int i) {
        boolean z;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(123858079);
        int i2 = (e18Var.h(androidComposeView) ? 4 : 2) | i | (e18Var.h(pz7Var) ? 32 : 16) | (e18Var.h(this) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        int i3 = 1;
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            Object tag = androidComposeView.getTag(R.id.inspection_slot_table_set);
            LinkedHashMap linkedHashMap = null;
            Set set = (!(tag instanceof Set) || ((tag instanceof mm9) && !(tag instanceof an9))) ? null : (Set) tag;
            if (set == null) {
                Object parent = androidComposeView.getParent();
                View view = parent instanceof View ? (View) parent : null;
                Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                set = (!(tag2 instanceof Set) || ((tag2 instanceof mm9) && !(tag2 instanceof an9))) ? null : (Set) tag2;
            }
            if (set != null) {
                set.add(e18Var.y());
                e18Var.q = true;
                e18Var.C = true;
                e18Var.c.e();
                e18Var.H.e();
                vag vagVar = e18Var.I;
                sag sagVar = vagVar.a;
                vagVar.e = sagVar.N;
                vagVar.f = sagVar.O;
            }
            Object objN = e18Var.N();
            u5f u5fVar = this.d;
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                Object parent2 = androidComposeView.getParent();
                parent2.getClass();
                View view2 = (View) parent2;
                Object tag3 = view2.getTag(R.id.compose_view_saveable_id_tag);
                String strValueOf = tag3 instanceof String ? (String) tag3 : null;
                if (strValueOf == null) {
                    strValueOf = String.valueOf(view2.getId());
                }
                String strI = ij0.i("SaveableStateRegistry:", strValueOf);
                q28 q28VarG = u5fVar.g();
                Bundle bundleI = q28VarG.i(strI);
                if (bundleI != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (String str : bundleI.keySet()) {
                        ArrayList parcelableArrayList = bundleI.getParcelableArrayList(str);
                        parcelableArrayList.getClass();
                        linkedHashMap.put(str, parcelableArrayList);
                    }
                }
                j06 j06Var = j06.I;
                umg umgVar = e5f.a;
                d5f d5fVar = new d5f(linkedHashMap, j06Var);
                if (q28VarG.t(strI) != null) {
                    z = false;
                    z86 z86Var = new z86(d5fVar, new a96(z, q28VarG, strI));
                    e18Var.k0(z86Var);
                    objN = z86Var;
                } else {
                    try {
                        q28VarG.B(strI, new u94(i3, d5fVar));
                        z = true;
                    } catch (IllegalArgumentException unused) {
                        z = false;
                    }
                    z86 z86Var2 = new z86(d5fVar, new a96(z, q28VarG, strI));
                    e18Var.k0(z86Var2);
                    objN = z86Var2;
                }
            }
            z86 z86Var3 = (z86) objN;
            boolean zH = e18Var.h(z86Var3);
            Object objN2 = e18Var.N();
            if (zH || objN2 == lz1Var) {
                objN2 = new e0(11, z86Var3);
                e18Var.k0(objN2);
            }
            fd9.d(iei.a, (bz7) objN2, e18Var);
            xe4 xe4Var = ve4.x;
            boolean zBooleanValue = ((Boolean) e18Var.j(xe4Var)).booleanValue() | androidComposeView.getScrollCaptureInProgress$ui();
            boolean zF = e18Var.f(androidComposeView.getView());
            Object objN3 = e18Var.N();
            if (zF || objN3 == lz1Var) {
                androidComposeView.getView();
                objN3 = new qyi();
                e18Var.k0(objN3);
            }
            j8.d(new hvd[]{tda.a.a(this.c), xda.a.a(u5fVar), w00.d.a(this.f), w00.e.a(this.g), w00.b.a(androidComposeView.getContext()), r59.a.a(set), w00.a.a(androidComposeView.getConfiguration()), e5f.a.a(z86Var3), w00.f.a(androidComposeView.getView()), xe4Var.a(Boolean.valueOf(zBooleanValue)), ve4.u.a(androidComposeView.getViewConfiguration()), cp8.a.a((qyi) objN3)}, fd9.q0(1317454175, new fd4(androidComposeView, this, pz7Var), e18Var), e18Var, 56);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fd4(this, androidComposeView, pz7Var, i);
        }
    }

    public final void b() {
        int i = this.u - 1;
        this.u = i;
        if (i < 0) {
            Log.e("ComposeViewContext", "View count has dropped below 0");
            this.u = 0;
        }
        if (this.u == 0) {
            View view = this.a;
            Context context = view.getContext();
            gd4 gd4Var = this.w;
            context.unregisterComponentCallbacks(gd4Var);
            y1a y1aVar = this.s;
            if (y1aVar.b == null) {
                y1aVar.a = null;
            }
            view.getViewTreeObserver().removeOnWindowFocusChangeListener(gd4Var);
        }
    }

    public final void c() {
        int i = this.u + 1;
        this.u = i;
        if (i == 1) {
            View view = this.a;
            Context context = view.getContext();
            gd4 gd4Var = this.w;
            context.registerComponentCallbacks(gd4Var);
            d(view.getResources().getConfiguration());
            boolean zHasWindowFocus = view.hasWindowFocus();
            y1a y1aVar = this.s;
            y1aVar.c.setValue(Boolean.valueOf(zHasWindowFocus));
            lsc lscVar = y1aVar.b;
            l4 l4Var = this.v;
            if (lscVar == null) {
                y1aVar.a = l4Var;
            }
            if (lscVar != null) {
                lscVar.setValue(l4Var.a());
            }
            view.getViewTreeObserver().addOnWindowFocusChangeListener(gd4Var);
        }
    }

    public final void d(Configuration configuration) {
        int iUpdateFrom = this.h.updateFrom(configuration);
        if (iUpdateFrom != 0) {
            Iterator it = this.f.a.entrySet().iterator();
            while (it.hasNext()) {
                qy8 qy8Var = (qy8) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (qy8Var == null || Configuration.needNewResources(iUpdateFrom, qy8Var.b)) {
                    it.remove();
                }
            }
            this.i.setValue(new Configuration(configuration));
            rpe rpeVar = this.g;
            synchronized (rpeVar) {
                rpeVar.a.c();
            }
            if ((268435456 & iUpdateFrom) != 0) {
                this.o.setValue(wd6.j0(this.a.getContext()));
            }
            if (((-1342235264) & iUpdateFrom) != 0) {
                y1a y1aVar = this.s;
                l4 l4Var = this.v;
                lsc lscVar = y1aVar.b;
                if (lscVar != null) {
                    lscVar.setValue(l4Var.a());
                }
            }
        }
    }
}
