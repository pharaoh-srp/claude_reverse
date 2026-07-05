package androidx.compose.ui.tooling;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import defpackage.ba4;
import defpackage.bsg;
import defpackage.ca4;
import defpackage.ny3;
import defpackage.ra7;
import defpackage.sz6;
import defpackage.ta4;
import java.lang.reflect.Constructor;
import kotlin.jvm.KotlinReflectionNotSupportedError;

/* JADX INFO: loaded from: classes3.dex */
public final class PreviewActivity extends ba4 {
    public static final /* synthetic */ int Z = 0;

    @Override // defpackage.ba4, defpackage.aa4, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        Class<?> cls;
        super.onCreate(bundle);
        if ((getApplicationInfo().flags & 2) == 0) {
            finish();
            return;
        }
        Intent intent = getIntent();
        if (intent == null || (stringExtra = intent.getStringExtra("composable")) == null) {
            return;
        }
        String strI1 = bsg.i1('.', stringExtra, stringExtra);
        String strD1 = bsg.d1('.', stringExtra, stringExtra);
        String stringExtra2 = getIntent().getStringExtra("parameterProviderClassName");
        if (stringExtra2 == null) {
            ca4.a(this, new ta4(-840626948, true, new ny3(strI1, strD1, 5)));
            return;
        }
        try {
            cls = Class.forName(stringExtra2);
        } catch (ClassNotFoundException e) {
            Log.e("PreviewLogger", "Unable to find PreviewProvider '" + stringExtra2 + '\'', e);
            cls = null;
        }
        getIntent().getIntExtra("parameterProviderIndex", -1);
        int i = 0;
        if (cls == null) {
            ca4.a(this, new ta4(-1901447514, true, new ra7(strI1, strD1, new Object[0], 21)));
            return;
        }
        try {
            Constructor<?>[] constructors = cls.getConstructors();
            int length = constructors.length;
            Constructor<?> constructor = null;
            boolean z = false;
            while (true) {
                if (i < length) {
                    Constructor<?> constructor2 = constructors[i];
                    if (constructor2.getParameterTypes().length == 0) {
                        if (z) {
                            break;
                        }
                        z = true;
                        constructor = constructor2;
                    }
                    i++;
                } else if (!z) {
                }
            }
            constructor = null;
            if (constructor == null) {
                throw new IllegalArgumentException("PreviewParameterProvider constructor can not have parameters");
            }
            constructor.setAccessible(true);
            constructor.newInstance(null).getClass();
            throw new ClassCastException();
        } catch (KotlinReflectionNotSupportedError unused) {
            sz6.j("Deploying Compose Previews with PreviewParameterProvider arguments requires adding a dependency to the kotlin-reflect library.\nConsider adding 'debugImplementation \"org.jetbrains.kotlin:kotlin-reflect:$kotlin_version\"' to the module's build.gradle.");
        }
    }
}
