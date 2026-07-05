package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class zzlk extends IOException {
    public static zzlk a() {
        return new zzlk("Protocol message had invalid UTF-8.");
    }

    public static zzlk b() {
        return new zzlk("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static zzlk c() {
        return new zzlk("Failed to parse the message.");
    }

    public static zzlk d() {
        return new zzlk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
