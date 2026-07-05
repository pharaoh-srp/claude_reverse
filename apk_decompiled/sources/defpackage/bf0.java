package defpackage;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public class bf0 extends cf0 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf0(String str) {
        super("IMPLEMENTATION_ONLY_FEATURE", str);
        this.d = 3;
    }

    @Override // defpackage.cf0
    public final boolean a() {
        switch (this.d) {
            case 0:
                return true;
            case 1:
                return true;
            case 2:
                return false;
            case 3:
                return false;
            case 4:
                return true;
            case 5:
                return Build.VERSION.SDK_INT >= 27;
            case 6:
                return Build.VERSION.SDK_INT >= 28;
            default:
                return Build.VERSION.SDK_INT >= 29;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bf0(String str, String str2, int i) {
        super(str, str2);
        this.d = i;
    }
}
