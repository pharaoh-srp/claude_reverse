package org.jetbrains.compose.resources;

import defpackage.mdj;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lorg/jetbrains/compose/resources/MissingResourceException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "library_release"}, k = 1, mv = {2, 3, 0}, xi = mdj.f)
public final class MissingResourceException extends Exception {
    public MissingResourceException(String str, int i) {
        super("Missing resource with path: ".concat(str.concat(". Android context is not initialized. If it happens in the Preview mode then call PreviewContextConfigurationEffect() function.")));
    }

    public MissingResourceException(String str) {
        super("Missing resource with path: ".concat(str));
    }
}
