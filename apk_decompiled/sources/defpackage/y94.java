package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.content.res.AssetFileDescriptor;
import androidx.concurrent.futures.b;
import androidx.javascriptengine.JavaScriptException;
import androidx.javascriptengine.common.LengthLimitExceededException;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class y94 implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ int G;
    public final /* synthetic */ Object H;

    public /* synthetic */ y94(fc9 fc9Var, AssetFileDescriptor assetFileDescriptor, int i) {
        this.E = 3;
        this.F = fc9Var;
        this.H = assetFileDescriptor;
        this.G = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.E;
        Object obj = this.H;
        int i2 = this.G;
        Object obj2 = this.F;
        switch (i) {
            case 0:
                z94 z94Var = (z94) obj2;
                Object obj3 = ((g6) obj).E;
                String str = (String) z94Var.a.get(Integer.valueOf(i2));
                if (str != null) {
                    yc ycVar = (yc) z94Var.e.get(str);
                    if ((ycVar != null ? ycVar.a : null) == null) {
                        z94Var.g.remove(str);
                        z94Var.f.put(str, obj3);
                    } else {
                        qc qcVar = ycVar.a;
                        if (z94Var.d.remove(str)) {
                            qcVar.e(obj3);
                        }
                    }
                    break;
                }
                break;
            case 1:
                ((z94) obj2).a(i2, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) obj));
                break;
            case 2:
                ((s26) obj2).c.n(i2, obj);
                break;
            case 3:
                fc9 fc9Var = (fc9) obj2;
                AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
                ig0 ig0Var = fc9Var.j;
                b bVar = fc9Var.i;
                ig0Var.o(bVar);
                try {
                    ig0Var.j(bVar, i2, ttj.n(assetFileDescriptor, ig0Var.E, true));
                } catch (LengthLimitExceededException unused) {
                    sz6.h("unreachable");
                    return;
                } catch (IOException e) {
                    e = e;
                    bVar.b(new JavaScriptException("Retrieving error failed: " + e.getMessage()));
                    return;
                } catch (UnsupportedOperationException e2) {
                    e = e2;
                    bVar.b(new JavaScriptException("Retrieving error failed: " + e.getMessage()));
                    return;
                }
                break;
            case 4:
                hba hbaVar = (hba) obj;
                for (jba jbaVar : (CopyOnWriteArraySet) obj2) {
                    if (!jbaVar.d) {
                        if (i2 != -1) {
                            jbaVar.b.a(i2);
                        }
                        jbaVar.c = true;
                        hbaVar.invoke(jbaVar.a);
                    }
                }
                break;
            default:
                ((efe) obj2).n(i2, obj);
                break;
        }
    }

    public /* synthetic */ y94(Object obj, int i, Object obj2, int i2) {
        this.E = i2;
        this.F = obj;
        this.G = i;
        this.H = obj2;
    }
}
