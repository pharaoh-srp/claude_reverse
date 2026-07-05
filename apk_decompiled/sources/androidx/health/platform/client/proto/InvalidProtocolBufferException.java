package androidx.health.platform.client.proto;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class InvalidProtocolBufferException extends IOException {

    public static class InvalidWireTypeException extends InvalidProtocolBufferException {
    }

    public static InvalidProtocolBufferException a() {
        return new InvalidProtocolBufferException("Protocol message had invalid UTF-8.");
    }

    public static InvalidProtocolBufferException b() {
        return new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static InvalidProtocolBufferException c() {
        return new InvalidProtocolBufferException("Failed to parse the message.");
    }

    public static InvalidProtocolBufferException d() {
        return new InvalidProtocolBufferException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
