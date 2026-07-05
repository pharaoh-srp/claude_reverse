package com.agog.mathdisplay;

import defpackage.mdj;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/agog/mathdisplay/MathDisplayLogger;", "", "", "message", "Liei;", "warn", "(Ljava/lang/String;)V", "Companion", "mathdisplaylib"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
public interface MathDisplayLogger {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/agog/mathdisplay/MathDisplayLogger$Companion;", "", "<init>", "()V", "Lcom/agog/mathdisplay/MathDisplayLogger;", "logger", "Liei;", "set", "(Lcom/agog/mathdisplay/MathDisplayLogger;)V", "", "message", "warn$mathdisplaylib", "(Ljava/lang/String;)V", "warn", "instance", "Lcom/agog/mathdisplay/MathDisplayLogger;", "mathdisplaylib"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static volatile MathDisplayLogger instance;

        private Companion() {
        }

        public final void set(MathDisplayLogger logger) {
            instance = logger;
        }

        public final void warn$mathdisplaylib(String message) {
            message.getClass();
            MathDisplayLogger mathDisplayLogger = instance;
            if (mathDisplayLogger != null) {
                mathDisplayLogger.warn(message);
            }
        }
    }

    void warn(String message);
}
