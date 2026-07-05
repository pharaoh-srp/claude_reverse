package defpackage;

import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xl implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ UUID F;

    public /* synthetic */ xl(UUID uuid, int i) {
        this.E = i;
        this.F = uuid;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        boolean zEquals;
        int i = this.E;
        UUID uuid = this.F;
        switch (i) {
            case 0:
                ol olVar = (ol) obj;
                olVar.getClass();
                zEquals = olVar.a.equals(uuid);
                break;
            case 1:
                o32 o32Var = (o32) obj;
                o32Var.getClass();
                zEquals = o32Var.a.equals(uuid);
                break;
            default:
                o32 o32Var2 = (o32) obj;
                o32Var2.getClass();
                zEquals = o32Var2.a.equals(uuid);
                break;
        }
        return Boolean.valueOf(zEquals);
    }
}
