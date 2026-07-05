package defpackage;

import android.content.Context;
import okio.Path;

/* JADX INFO: loaded from: classes.dex */
public final class m10 implements tf5 {
    public final Context a;

    public m10(Context context) {
        this.a = context;
    }

    @Override // defpackage.tf5
    public final Path a() {
        String str = Path.F;
        String absolutePath = this.a.getFilesDir().getAbsolutePath();
        absolutePath.getClass();
        return Path.Companion.a(absolutePath);
    }

    @Override // defpackage.tf5
    public final Path b() {
        String str = Path.F;
        String absolutePath = this.a.getCacheDir().getAbsolutePath();
        absolutePath.getClass();
        return Path.Companion.a(absolutePath);
    }
}
