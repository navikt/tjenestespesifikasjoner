package no.nav.virksomhet.tjenester.utbetaling.v2;

import no.nav.virksomhet.tjenester.utbetaling.meldinger.v2.WSHentUtbetalingListeRequest;
import no.nav.virksomhet.tjenester.utbetaling.meldinger.v2.WSHentUtbetalingListeResponse;

public interface UtbetalingPortType {
    WSHentUtbetalingListeResponse hentUtbetalingListe(WSHentUtbetalingListeRequest request) throws HentUtbetalingListeMottakerIkkeFunnet, HentUtbetalingListeForMangeForekomster, HentUtbetalingListeBaksystemIkkeTilgjengelig, HentUtbetalingListeUgyldigDato;
}
