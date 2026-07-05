package com.anthropic.claude.api.chat;

import defpackage.fq6;
import defpackage.jd7;
import defpackage.k49;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.o49;
import defpackage.onf;
import defpackage.oq5;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/anthropic/claude/api/chat/InputMode;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "k49", "UNKNOWN", "TEXT", "RETRY", "SPEECH_INPUT", "VOICE", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = o49.class)
public final class InputMode {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ InputMode[] $VALUES;
    private static final kw9 $cachedKeepSerializer$delegate;
    public static final k49 Companion;
    public static final InputMode UNKNOWN = new InputMode("UNKNOWN", 0);
    public static final InputMode TEXT = new InputMode("TEXT", 1);
    public static final InputMode RETRY = new InputMode("RETRY", 2);
    public static final InputMode SPEECH_INPUT = new InputMode("SPEECH_INPUT", 3);
    public static final InputMode VOICE = new InputMode("VOICE", 4);

    private static final /* synthetic */ InputMode[] $values() {
        return new InputMode[]{UNKNOWN, TEXT, RETRY, SPEECH_INPUT, VOICE};
    }

    static {
        InputMode[] inputModeArr$values = $values();
        $VALUES = inputModeArr$values;
        $ENTRIES = wd6.n0(inputModeArr$values);
        Companion = new k49();
        $cachedKeepSerializer$delegate = yb5.w(w1a.F, new jd7(27));
    }

    private InputMode(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.api.chat.InputMode", values(), new String[]{"unknown", "text", "retry", "speech_input", "voice"}, new Annotation[][]{null, null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static InputMode valueOf(String str) {
        return (InputMode) Enum.valueOf(InputMode.class, str);
    }

    public static InputMode[] values() {
        return (InputMode[]) $VALUES.clone();
    }
}
