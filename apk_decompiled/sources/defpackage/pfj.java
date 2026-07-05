package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class pfj {
    public static final String i = nga.e("WorkContinuationImpl");
    public final bgj a;
    public final String b;
    public final c77 c;
    public final List d;
    public final ArrayList e;
    public final ArrayList f;
    public boolean g;
    public n78 h;

    public pfj(bgj bgjVar, String str, c77 c77Var, List list, int i2) {
        this.a = bgjVar;
        this.b = str;
        this.c = c77Var;
        this.d = list;
        this.e = new ArrayList(list.size());
        this.f = new ArrayList();
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (c77Var == c77.E && ((tgc) list.get(i3)).b.u != Long.MAX_VALUE) {
                sz6.p("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
                throw null;
            }
            String string = ((tgc) list.get(i3)).a.toString();
            string.getClass();
            this.e.add(string);
            this.f.add(string);
        }
    }

    public static HashSet b(pfj pfjVar) {
        HashSet hashSet = new HashSet();
        pfjVar.getClass();
        return hashSet;
    }

    public final n78 a() {
        if (this.g) {
            nga.c().f(i, "Already enqueued work ids (" + TextUtils.join(", ", this.e) + ")");
        } else {
            bgj bgjVar = this.a;
            this.h = nai.R(bgjVar.b.m, "EnqueueRunnable_" + this.c.name(), bgjVar.d.a, new g2h(10, this));
        }
        return this.h;
    }

    public pfj(bgj bgjVar, List list) {
        this(bgjVar, null, c77.F, list, 0);
    }

    public pfj(bgj bgjVar, String str, c77 c77Var, List list) {
        this(bgjVar, str, c77Var, list, 0);
    }
}
