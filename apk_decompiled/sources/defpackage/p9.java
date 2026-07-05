package defpackage;

import android.os.Message;
import android.view.View;
import androidx.appcompat.widget.Toolbar;

/* JADX INFO: loaded from: classes2.dex */
public final class p9 implements View.OnClickListener {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;

    public /* synthetic */ p9(int i, Object obj) {
        this.E = i;
        this.F = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message message;
        int i = this.E;
        Message messageObtain = null;
        messageObtain = null;
        Object obj = this.F;
        switch (i) {
            case 0:
                ((ob) obj).b();
                break;
            case 1:
                zs zsVar = (zs) obj;
                if (view == zsVar.i && (message = zsVar.k) != null) {
                    messageObtain = Message.obtain(message);
                }
                if (messageObtain != null) {
                    messageObtain.sendToTarget();
                }
                zsVar.z.obtainMessage(1, zsVar.b).sendToTarget();
                break;
            default:
                j1i j1iVar = ((Toolbar) obj).s0;
                adb adbVar = j1iVar != null ? j1iVar.F : null;
                if (adbVar != null) {
                    adbVar.collapseActionView();
                }
                break;
        }
    }
}
