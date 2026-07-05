package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import java.io.FileNotFoundException;
import java.io.InputStream;
import org.jetbrains.compose.resources.AndroidContextProvider;
import org.jetbrains.compose.resources.MissingResourceException;

/* JADX INFO: loaded from: classes.dex */
public final class np5 {
    public static final np5 a = new np5();

    public static InputStream a(String str) {
        InputStream resourceAsStream;
        AssetManager assets;
        InputStream inputStreamOpen;
        try {
            try {
                try {
                    Context context = AndroidContextProvider.E;
                    AssetManager assets2 = context != null ? context.getAssets() : null;
                    if (assets2 == null || (inputStreamOpen = assets2.open(str)) == null) {
                        throw new FileNotFoundException("Current AssetManager is null.");
                    }
                    return inputStreamOpen;
                } catch (NoClassDefFoundError unused) {
                    assets = null;
                }
            } catch (FileNotFoundException unused2) {
                ClassLoader classLoader = np5.class.getClassLoader();
                if (classLoader == null) {
                    sz6.j("Cannot find class loader");
                    return null;
                }
                resourceAsStream = classLoader.getResourceAsStream(str);
                if (resourceAsStream == null) {
                    if (AndroidContextProvider.E == null) {
                        throw new MissingResourceException(str, 0);
                    }
                    throw new MissingResourceException(str);
                }
            }
        } catch (FileNotFoundException unused3) {
            assets = f10.b().getAssets();
        }
        if (assets == null || (resourceAsStream = assets.open(str)) == null) {
            throw new FileNotFoundException("Current AssetManager is null.");
        }
        return resourceAsStream;
    }
}
