package defpackage;

import android.content.res.Resources;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yz extends m08 implements rz7 {
    public final /* synthetic */ int E = 1;

    public /* synthetic */ yz(int i, int i2, Class cls, Object obj, String str, String str2) {
        super(i, i2, cls, obj, str, str2);
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.E) {
            case 0:
                ij0.x(obj);
                AndroidComposeView androidComposeView = (AndroidComposeView) this.receiver;
                Class cls = AndroidComposeView.r1;
                Resources resources = androidComposeView.getContext().getResources();
                return Boolean.valueOf(n00.a.a(androidComposeView, null, new pc4(new fz5(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale), ((k8g) obj2).a, (bz7) obj3)));
            default:
                String str = (String) obj;
                String str2 = (String) obj2;
                Map map = (Map) obj3;
                str.getClass();
                str2.getClass();
                map.getClass();
                ((qk5) this.receiver).getClass();
                if (kj5.b()) {
                    t78.a(kj5.a(null)).d(str, str2, map);
                }
                return iei.a;
        }
    }
}
