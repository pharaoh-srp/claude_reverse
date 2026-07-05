package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Spanned;
import android.view.inputmethod.EditorInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public final class gl6 {
    public static final Object j = new Object();
    public static volatile gl6 k;
    public final ReentrantReadWriteLock a;
    public final ip0 b;
    public volatile int c;
    public final Handler d;
    public final bl6 e;
    public final fl6 f;
    public final a5 g;
    public final int h;
    public final kr5 i;

    public gl6(il6 il6Var) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.a = reentrantReadWriteLock;
        this.c = 3;
        fl6 fl6Var = (fl6) il6Var.b;
        this.f = fl6Var;
        int i = il6Var.a;
        this.h = i;
        this.i = (kr5) il6Var.c;
        this.d = new Handler(Looper.getMainLooper());
        this.b = new ip0(0);
        this.g = new a5(18);
        bl6 bl6Var = new bl6(this);
        this.e = bl6Var;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.c = 0;
            } catch (Throwable th) {
                this.a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (c() == 0) {
            try {
                fl6Var.a(new al6(bl6Var));
            } catch (Throwable th2) {
                f(th2);
            }
        }
    }

    public static gl6 a() {
        gl6 gl6Var;
        synchronized (j) {
            try {
                gl6Var = k;
                if (!(gl6Var != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return gl6Var;
    }

    public static boolean d() {
        return k != null;
    }

    public final int b(int i, CharSequence charSequence) {
        if (!(c() == 1)) {
            sz6.j("Not initialized yet");
            return 0;
        }
        knk.q("charSequence cannot be null", charSequence);
        xv8 xv8Var = this.e.b;
        xv8Var.getClass();
        if (i < 0 || i >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            qbi[] qbiVarArr = (qbi[]) spanned.getSpans(i, i + 1, qbi.class);
            if (qbiVarArr.length > 0) {
                return spanned.getSpanStart(qbiVarArr[0]);
            }
        }
        return ((tl6) xv8Var.v(charSequence, Math.max(0, i - 16), Math.min(charSequence.length(), i + 16), Integer.MAX_VALUE, true, new tl6(i))).F;
    }

    public final int c() {
        this.a.readLock().lock();
        try {
            return this.c;
        } finally {
            this.a.readLock().unlock();
        }
    }

    public final void e() {
        if (!(this.h == 1)) {
            sz6.j("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
            return;
        }
        if (c() == 1) {
            return;
        }
        this.a.writeLock().lock();
        try {
            if (this.c == 0) {
                return;
            }
            this.c = 0;
            this.a.writeLock().unlock();
            bl6 bl6Var = this.e;
            gl6 gl6Var = bl6Var.a;
            try {
                gl6Var.f.a(new al6(bl6Var));
            } catch (Throwable th) {
                gl6Var.f(th);
            }
        } finally {
            this.a.writeLock().unlock();
        }
    }

    public final void f(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 2;
            arrayList.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post(new el6(arrayList, this.c, th));
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008c A[Catch: all -> 0x007f, TRY_ENTER, TryCatch #2 {all -> 0x007f, blocks: (B:38:0x0057, B:41:0x005c, B:43:0x0060, B:45:0x006d, B:52:0x008c, B:54:0x0096, B:56:0x0099, B:58:0x009c, B:60:0x00ac, B:61:0x00af), top: B:107:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009c A[Catch: all -> 0x007f, TryCatch #2 {all -> 0x007f, blocks: (B:38:0x0057, B:41:0x005c, B:43:0x0060, B:45:0x006d, B:52:0x008c, B:54:0x0096, B:56:0x0099, B:58:0x009c, B:60:0x00ac, B:61:0x00af), top: B:107:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00be A[Catch: all -> 0x00f6, TRY_ENTER, TryCatch #0 {all -> 0x00f6, blocks: (B:65:0x00be, B:68:0x00c6, B:50:0x0082), top: B:103:0x0082 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence g(int r12, int r13, int r14, java.lang.CharSequence r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gl6.g(int, int, int, java.lang.CharSequence):java.lang.CharSequence");
    }

    public final void h(dl6 dl6Var) {
        knk.q("initCallback cannot be null", dl6Var);
        this.a.writeLock().lock();
        try {
            if (this.c == 1 || this.c == 2) {
                this.d.post(new el6(Arrays.asList(dl6Var), this.c, null));
            } else {
                this.b.add(dl6Var);
            }
            this.a.writeLock().unlock();
        } catch (Throwable th) {
            this.a.writeLock().unlock();
            throw th;
        }
    }

    public final void i(EditorInfo editorInfo) {
        if (c() != 1 || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        bl6 bl6Var = this.e;
        bl6Var.getClass();
        editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", bl6Var.c.s());
        editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }
}
