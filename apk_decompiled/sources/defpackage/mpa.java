package defpackage;

import com.anthropic.claude.mainactivity.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public final class mpa implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ MainActivity F;

    public /* synthetic */ mpa(MainActivity mainActivity, int i) {
        this.E = i;
        this.F = mainActivity;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        MainActivity mainActivity = this.F;
        switch (i) {
            case 0:
                return eve.z(mainActivity).a(jce.a.b(npa.class), null, null);
            case 1:
                return eve.z(mainActivity).a(jce.a.b(md9.class), null, null);
            case 2:
                return mainActivity.f();
            default:
                return mainActivity.d();
        }
    }
}
