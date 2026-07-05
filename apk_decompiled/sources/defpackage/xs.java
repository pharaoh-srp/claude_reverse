package defpackage;

import android.content.DialogInterface;
import android.media.MediaCodec;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class xs extends Handler {
    public final /* synthetic */ int a = 0;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xs(p11 p11Var, Looper looper) {
        super(looper);
        this.b = p11Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (this.a) {
            case 0:
                int i = message.what;
                if (i == -3 || i == -2 || i == -1) {
                    ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) ((WeakReference) this.b).get(), message.what);
                    return;
                } else {
                    if (i != 1) {
                        return;
                    }
                    ((DialogInterface) message.obj).dismiss();
                    return;
                }
            default:
                p11 p11Var = (p11) this.b;
                int i2 = message.what;
                o11 o11Var = null;
                if (i2 == 1) {
                    o11 o11Var2 = (o11) message.obj;
                    try {
                        p11Var.E.queueInputBuffer(o11Var2.a, 0, o11Var2.b, o11Var2.d, o11Var2.e);
                        break;
                    } catch (RuntimeException e) {
                        AtomicReference atomicReference = p11Var.H;
                        while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                        }
                    }
                    o11Var = o11Var2;
                } else if (i2 == 2) {
                    o11 o11Var3 = (o11) message.obj;
                    int i3 = o11Var3.a;
                    MediaCodec.CryptoInfo cryptoInfo = o11Var3.c;
                    long j = o11Var3.d;
                    int i4 = o11Var3.e;
                    try {
                        if (Build.VERSION.SDK_INT < 31) {
                            synchronized (p11.L) {
                                p11Var.E.queueSecureInputBuffer(i3, 0, cryptoInfo, j, i4);
                            }
                        } else {
                            p11Var.E.queueSecureInputBuffer(i3, 0, cryptoInfo, j, i4);
                        }
                        break;
                    } catch (RuntimeException e2) {
                        AtomicReference atomicReference2 = p11Var.H;
                        while (!atomicReference2.compareAndSet(null, e2) && atomicReference2.get() == null) {
                        }
                    }
                    o11Var = o11Var3;
                } else if (i2 == 3) {
                    p11Var.I.c();
                } else if (i2 != 4) {
                    AtomicReference atomicReference3 = p11Var.H;
                    IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(i2));
                    while (!atomicReference3.compareAndSet(null, illegalStateException) && atomicReference3.get() == null) {
                    }
                } else {
                    try {
                        p11Var.E.setParameters((Bundle) message.obj);
                        break;
                    } catch (RuntimeException e3) {
                        AtomicReference atomicReference4 = p11Var.H;
                        while (!atomicReference4.compareAndSet(null, e3) && atomicReference4.get() == null) {
                        }
                    }
                }
                if (o11Var != null) {
                    ArrayDeque arrayDeque = p11.K;
                    synchronized (arrayDeque) {
                        arrayDeque.add(o11Var);
                        break;
                    }
                    return;
                }
                return;
        }
    }

    public /* synthetic */ xs() {
    }
}
