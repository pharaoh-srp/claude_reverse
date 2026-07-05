package defpackage;

import android.os.Build;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qz implements Runnable {
    public final /* synthetic */ int E;

    public /* synthetic */ qz(int i) {
        this.E = i;
    }

    private final void a() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.E) {
            case 0:
                qvb qvbVar = AndroidComposeView.u1;
                synchronized (qvbVar) {
                    try {
                        int i = Build.VERSION.SDK_INT;
                        Object[] objArr = qvbVar.a;
                        int i2 = qvbVar.b;
                        final int i3 = 0;
                        if (i < 30) {
                            for (int i4 = 0; i4 < i2; i4++) {
                                final AndroidComposeView androidComposeView = (AndroidComposeView) objArr[i4];
                                boolean showLayoutBounds = androidComposeView.getShowLayoutBounds();
                                Class cls = AndroidComposeView.r1;
                                androidComposeView.setShowLayoutBounds(oq5.A());
                                if (showLayoutBounds != androidComposeView.getShowLayoutBounds()) {
                                    androidComposeView.post(new Runnable() { // from class: rz
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i5 = i3;
                                            AndroidComposeView androidComposeView2 = androidComposeView;
                                            switch (i5) {
                                                case 0:
                                                    AndroidComposeView.m(androidComposeView2.getRoot());
                                                    break;
                                                default:
                                                    AndroidComposeView.m(androidComposeView2.getRoot());
                                                    break;
                                            }
                                        }
                                    });
                                }
                            }
                        } else {
                            while (i3 < i2) {
                                final AndroidComposeView androidComposeView2 = (AndroidComposeView) objArr[i3];
                                final int i5 = 1;
                                androidComposeView2.post(new Runnable() { // from class: rz
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i52 = i5;
                                        AndroidComposeView androidComposeView22 = androidComposeView2;
                                        switch (i52) {
                                            case 0:
                                                AndroidComposeView.m(androidComposeView22.getRoot());
                                                break;
                                            default:
                                                AndroidComposeView.m(androidComposeView22.getRoot());
                                                break;
                                        }
                                    }
                                });
                                i3++;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                return;
        }
    }
}
