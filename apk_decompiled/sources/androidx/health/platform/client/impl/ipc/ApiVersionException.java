package androidx.health.platform.client.impl.ipc;

import defpackage.grc;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes3.dex */
public class ApiVersionException extends ExecutionException {
    public ApiVersionException(int i, int i2) {
        super(grc.o(i, i2, "Version requirements for calling the method was not met, remoteVersion: ", ", minVersion: "));
    }
}
