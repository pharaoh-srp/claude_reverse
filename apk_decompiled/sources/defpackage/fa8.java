package defpackage;

import java.text.BreakIterator;

/* JADX INFO: loaded from: classes3.dex */
public final class fa8 extends mqk {
    public final BreakIterator F;

    public fa8(CharSequence charSequence) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.F = characterInstance;
    }

    @Override // defpackage.mqk
    public final int g(int i) {
        return this.F.following(i);
    }

    @Override // defpackage.mqk
    public final int i(int i) {
        return this.F.preceding(i);
    }
}
