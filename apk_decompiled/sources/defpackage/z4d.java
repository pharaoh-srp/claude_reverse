package defpackage;

import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class z4d implements gf8 {
    public final View a;

    public z4d(View view) {
        this.a = view;
    }

    @Override // defpackage.gf8
    public final void a(int i) {
        int i2 = 16;
        if (!hf8.b(i, 16)) {
            i2 = 6;
            if (!hf8.b(i, 6)) {
                i2 = 13;
                if (!hf8.b(i, 13)) {
                    i2 = 23;
                    if (!hf8.b(i, 23)) {
                        i2 = 3;
                        if (!hf8.b(i, 3)) {
                            i2 = 0;
                            if (!hf8.b(i, 0)) {
                                i2 = 17;
                                if (!hf8.b(i, 17)) {
                                    i2 = 27;
                                    if (!hf8.b(i, 27)) {
                                        i2 = 26;
                                        if (!hf8.b(i, 26)) {
                                            i2 = 9;
                                            if (!hf8.b(i, 9)) {
                                                i2 = 22;
                                                if (!hf8.b(i, 22)) {
                                                    i2 = 21;
                                                    if (!hf8.b(i, 21)) {
                                                        i2 = 1;
                                                        if (!hf8.b(i, 1)) {
                                                            i2 = -1;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        WeakHashMap weakHashMap = mvi.a;
        int iF = ask.f(i2);
        if (iF == -1) {
            return;
        }
        this.a.performHapticFeedback(iF);
    }
}
