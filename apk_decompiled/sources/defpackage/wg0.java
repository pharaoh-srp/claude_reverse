package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.PowerManager;

/* JADX INFO: loaded from: classes2.dex */
public final class wg0 extends k5 {
    public final /* synthetic */ int c = 0;
    public final /* synthetic */ ah0 d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wg0(ah0 ah0Var, Context context) {
        super(ah0Var);
        this.d = ah0Var;
        this.e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @Override // defpackage.k5
    public final IntentFilter d() {
        switch (this.c) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    @Override // defpackage.k5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h() {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wg0.h():int");
    }

    @Override // defpackage.k5
    public final void q() {
        int i = this.c;
        ah0 ah0Var = this.d;
        switch (i) {
            case 0:
                ah0Var.e(true);
                break;
            default:
                ah0Var.e(true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wg0(ah0 ah0Var, lrb lrbVar) {
        super(ah0Var);
        this.d = ah0Var;
        this.e = lrbVar;
    }
}
