package com.arkivanov.essenty.statekeeper;

import com.anthropic.claude.api.experience.ExperienceToggle;
import defpackage.dvj;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.pnf;
import defpackage.qnf;
import defpackage.rnf;
import defpackage.s06;
import defpackage.znf;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0003\u0013\u0017\u0018B\u0013\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J'\u0010\n\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0007*\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u000f\u001a\u00020\u000e\"\b\b\u0000\u0010\u0007*\u00020\u00012\b\u0010\f\u001a\u0004\u0018\u00018\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\r¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0006R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u001c\u0010\u0014\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/arkivanov/essenty/statekeeper/SerializableContainer;", "", "", "data", "<init>", "([B)V", "()V", "T", "Ls06;", "strategy", "consume", "(Ls06;)Ljava/lang/Object;", ExperienceToggle.DEFAULT_PARAM_KEY, "Lznf;", "Liei;", "set", "(Ljava/lang/Object;Lznf;)V", "clear", "[B", "Lqnf;", "holder", "Lqnf;", "Companion", "rnf", "pnf", "state-keeper_release"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
@onf(with = rnf.class)
public final class SerializableContainer {
    public static final pnf Companion = new pnf();
    private byte[] data;
    private qnf holder;

    private SerializableContainer(byte[] bArr) {
        this.data = bArr;
    }

    public final void clear() {
        this.holder = null;
        this.data = null;
    }

    public final <T> T consume(s06 strategy) {
        T t;
        strategy.getClass();
        qnf qnfVar = this.holder;
        if (qnfVar == null || (t = (T) qnfVar.a) == null) {
            byte[] bArr = this.data;
            t = bArr != null ? (T) dvj.f(bArr, strategy) : null;
        }
        this.holder = null;
        this.data = null;
        return t;
    }

    public final <T> void set(T value, znf strategy) {
        strategy.getClass();
        this.holder = new qnf(value, strategy);
        this.data = null;
    }

    public /* synthetic */ SerializableContainer(byte[] bArr, mq5 mq5Var) {
        this(bArr);
    }

    public SerializableContainer() {
        this(null);
    }
}
