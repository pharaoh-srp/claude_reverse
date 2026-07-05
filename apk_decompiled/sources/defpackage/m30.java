package defpackage;

import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

/* JADX INFO: loaded from: classes.dex */
public final class m30 extends Handler {
    public static final m30 a = new m30();

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        logRecord.getClass();
        CopyOnWriteArraySet copyOnWriteArraySet = l30.a;
        String loggerName = logRecord.getLoggerName();
        loggerName.getClass();
        int iC = bqk.c(logRecord);
        String message = logRecord.getMessage();
        message.getClass();
        l30.a(loggerName, iC, message, logRecord.getThrown());
    }
}
