package defpackage;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class zue {
    public final pl9 a;
    public final Context b;
    public final String c;
    public final k91 d;
    public final ArrayList e;
    public final ArrayList f;
    public Executor g;
    public Executor h;
    public cd i;
    public boolean j;
    public final bve k;
    public final long l;
    public final aoa m;
    public final LinkedHashSet n;
    public final LinkedHashSet o;
    public final ArrayList p;
    public boolean q;
    public boolean r;
    public boolean s;
    public k02 t;
    public final boolean u;

    public zue(Context context, String str) {
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.k = bve.E;
        this.l = -1L;
        this.m = new aoa(1);
        this.n = new LinkedHashSet();
        this.o = new LinkedHashSet();
        this.p = new ArrayList();
        this.q = true;
        this.u = true;
        this.a = jce.a.b(WorkDatabase.class);
        this.b = context;
        this.c = str;
        this.d = null;
    }

    public final void a(ekb... ekbVarArr) {
        for (ekb ekbVar : ekbVarArr) {
            Integer numValueOf = Integer.valueOf(ekbVar.a);
            LinkedHashSet linkedHashSet = this.o;
            linkedHashSet.add(numValueOf);
            linkedHashSet.add(Integer.valueOf(ekbVar.b));
        }
        ekb[] ekbVarArr2 = (ekb[]) Arrays.copyOf(ekbVarArr, ekbVarArr.length);
        aoa aoaVar = this.m;
        aoaVar.getClass();
        for (ekb ekbVar2 : ekbVarArr2) {
            aoaVar.a(ekbVar2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x01cf, code lost:
    
        defpackage.sz6.p("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01d4, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.cve b() {
        /*
            Method dump skipped, instruction units count: 895
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zue.b():cve");
    }

    public zue(pl9 pl9Var, String str, Context context) {
        k91 k91Var = k91.G;
        pl9Var.getClass();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.k = bve.E;
        this.l = -1L;
        this.m = new aoa(1);
        this.n = new LinkedHashSet();
        this.o = new LinkedHashSet();
        this.p = new ArrayList();
        this.q = true;
        this.u = true;
        this.a = pl9Var;
        this.b = context;
        this.c = str;
        this.d = k91Var;
    }
}
