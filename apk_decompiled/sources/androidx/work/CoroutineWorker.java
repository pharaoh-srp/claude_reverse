package androidx.work;

import android.content.Context;
import defpackage.c45;
import defpackage.e45;
import defpackage.knk;
import defpackage.mdj;
import defpackage.mf9;
import defpackage.nai;
import defpackage.o92;
import defpackage.p45;
import defpackage.q45;
import defpackage.rwj;
import defpackage.vp4;
import defpackage.x44;
import defpackage.zaa;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/work/CoroutineWorker;", "Lzaa;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "p45", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public abstract class CoroutineWorker extends zaa {
    public final WorkerParameters e;
    public final p45 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.e = workerParameters;
        this.f = p45.G;
    }

    @Override // defpackage.zaa
    public final o92 a() {
        e45 j = getJ();
        mf9 mf9VarG = knk.g();
        j.getClass();
        return rwj.m(nai.Z(j, mf9VarG), new q45(this, null, 0));
    }

    @Override // defpackage.zaa
    public final o92 c() {
        c45 j = !x44.r(getJ(), p45.G) ? getJ() : this.e.e;
        j.getClass();
        return rwj.m(j.r0(knk.g()), new q45(this, null, 1));
    }

    public abstract Object d(vp4 vp4Var);

    /* JADX INFO: renamed from: e */
    public e45 getJ() {
        return this.f;
    }
}
