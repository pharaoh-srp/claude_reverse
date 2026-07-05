package defpackage;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vo5 extends m08 implements bz7 {
    public static final vo5 E = new vo5(1, yfd.class, "printError", "printError(Ljava/lang/Exception;)V", 1);

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        Exception exc = (Exception) obj;
        exc.getClass();
        if (yfd.a) {
            try {
                String message = exc.getMessage();
                if (message == null) {
                    message = "An occurred in Decompose";
                }
                Log.e("Decompose", message, exc);
            } catch (Exception unused) {
                yfd.a = false;
            }
        }
        return iei.a;
    }
}
