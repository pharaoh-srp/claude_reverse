package org.koin.android.error;

import defpackage.mdj;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/koin/android/error/MissingAndroidContextException;", "", "koin-android_release"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final class MissingAndroidContextException extends Throwable {
    public MissingAndroidContextException() {
        super("Can't resolve Context instance. Please use androidContext() function in your KoinApplication configuration.");
    }
}
