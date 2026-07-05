package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public abstract class rne {
    public static final nne E;
    public static final /* synthetic */ rne[] F;

    /* JADX INFO: Fake field, exist only in values array */
    rne EF0;

    static {
        rne rneVar = new rne() { // from class: mne
        };
        nne nneVar = new nne();
        E = nneVar;
        F = new rne[]{rneVar, nneVar, new rne() { // from class: one
        }, new rne() { // from class: pne
        }, new rne() { // from class: qne
        }};
    }

    public static rne valueOf(String str) {
        return (rne) Enum.valueOf(rne.class, str);
    }

    public static rne[] values() {
        return (rne[]) F.clone();
    }
}
