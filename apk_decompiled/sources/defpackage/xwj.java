package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.reflect.jvm.internal.impl.types.a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class xwj {
    public static final ta4 a = new ta4(-1654898007, false, new bb4(21));

    public static final void a(ydh ydhVar, final Context context, final boolean z, final CharSequence charSequence, final long j) {
        if (kkh.d(j) || charSequence.length() == 0) {
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        List list = (List) kvj.c.invoke(context);
        if (list.isEmpty()) {
            return;
        }
        ydhVar.a();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            final ResolveInfo resolveInfo = (ResolveInfo) list.get(i);
            tnk.i(ydhVar, new qhd(i), resolveInfo.loadLabel(packageManager).toString(), 0, new bz7() { // from class: rhd
                @Override // defpackage.bz7
                public final Object invoke(Object obj) {
                    kvj.d.m(context, resolveInfo, Boolean.valueOf(z), charSequence, new kkh(j));
                    ((meh) obj).close();
                    return iei.a;
                }
            });
        }
        ydhVar.a();
    }

    public static dba b(String str, Object obj) {
        dgj.w("Listener must not be null", obj);
        dgj.t(str, "Listener type must not be empty");
        return new dba(str, obj);
    }

    public static ns6 c(qh9 qh9Var) {
        try {
            os6 os6VarI = ywj.i(qh9Var.s("view").g());
            String strM = qh9Var.s("source").m();
            strM.getClass();
            for (int i : sq6.H(11)) {
                if (ms6.n(i).equals(strM)) {
                    return new ns6(os6VarI, i);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type Container", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type Container", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type Container", e3);
            return null;
        }
    }

    public static owi d(qh9 qh9Var) {
        try {
            return new owi(qh9Var.s("start").k(), qh9Var.s("duration").k());
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type InForegroundPeriod", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type InForegroundPeriod", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type InForegroundPeriod", e3);
            return null;
        }
    }

    public static final eq3 e(yd2 yd2Var) {
        yd2Var.getClass();
        oub oubVar = yd2Var.d;
        double d = dxj.h(yd2Var, oubVar).E;
        ge2 ge2Var = yd2Var.a;
        double d2 = (ge2Var.d().d() * ((double) ((ge2Var.j() * yd2Var.e) / oubVar.a))) + d;
        return new eq3(d2, (ge2Var.d().d() * ((double) (yd2Var.b.width() / oubVar.a))) + d2);
    }

    public static final yr9 f(qai qaiVar) {
        qaiVar.getClass();
        bo5 bo5VarH = qaiVar.h();
        bo5VarH.getClass();
        int i = 0;
        if (bo5VarH instanceof yh3) {
            List parameters = ((yh3) bo5VarH).p().getParameters();
            parameters.getClass();
            List list = parameters;
            ArrayList arrayList = new ArrayList(x44.y(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                u9i u9iVarP = ((qai) it.next()).p();
                u9iVarP.getClass();
                arrayList.add(u9iVarP);
            }
            List upperBounds = qaiVar.getUpperBounds();
            upperBounds.getClass();
            or9 or9VarE = o06.e(qaiVar);
            yr9 yr9VarK = new a(new tkg(i, arrayList)).k(3, (yr9) w44.L0(upperBounds));
            return yr9VarK == null ? or9VarE.n() : yr9VarK;
        }
        if (!(bo5VarH instanceof h08)) {
            sz6.p("Unsupported descriptor type to build star projection type based on type parameters of it");
            return null;
        }
        List typeParameters = ((h08) bo5VarH).getTypeParameters();
        typeParameters.getClass();
        List list2 = typeParameters;
        ArrayList arrayList2 = new ArrayList(x44.y(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            u9i u9iVarP2 = ((qai) it2.next()).p();
            u9iVarP2.getClass();
            arrayList2.add(u9iVarP2);
        }
        List upperBounds2 = qaiVar.getUpperBounds();
        upperBounds2.getClass();
        or9 or9VarE2 = o06.e(qaiVar);
        yr9 yr9VarK2 = new a(new tkg(i, arrayList2)).k(3, (yr9) w44.L0(upperBounds2));
        return yr9VarK2 == null ? or9VarE2.n() : yr9VarK2;
    }

    public static final iqb g(iqb iqbVar, o1i o1iVar, bz7 bz7Var, thh thhVar, bz7 bz7Var2) {
        return iqbVar.B(new oeh(o1iVar, bz7Var, thhVar, bz7Var2));
    }

    public static final l9e h(l9e l9eVar, cu9 cu9Var, cu9 cu9Var2) {
        if (!cu9Var.n() || !cu9Var2.n()) {
            return l9e.e;
        }
        return d4c.x(cu9Var2.G(nai.A(cu9Var), l9eVar.h()), l9eVar.g());
    }
}
