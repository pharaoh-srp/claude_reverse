package defpackage;

import com.anthropic.claude.conway.send.OutboxItem;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class kx4 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ OutboxItem F;

    public /* synthetic */ kx4(OutboxItem outboxItem, int i) {
        this.E = i;
        this.F = outboxItem;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        boolean z = false;
        OutboxItem outboxItem = this.F;
        wpg wpgVar = (wpg) obj;
        switch (i) {
            case 0:
                wpgVar.getClass();
                if (wpgVar instanceof upg) {
                    upg upgVar = (upg) wpgVar;
                    if (x44.r(upgVar.a, outboxItem.getText()) && upgVar.b == outboxItem.getQueuedAt()) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            default:
                wpgVar.getClass();
                if (wpgVar instanceof upg) {
                    upg upgVar2 = (upg) wpgVar;
                    if (x44.r(upgVar2.a, outboxItem.getText()) && upgVar2.b == outboxItem.getQueuedAt()) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
        }
    }
}
