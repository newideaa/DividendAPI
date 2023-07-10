package com.example.dividendservice.scraper;

import com.example.dividendservice.model.Company;
import com.example.dividendservice.model.ScrapedResult;

public interface Scraper {
    Company scrapCompanyByTicker(String ticker);
    ScrapedResult scrap(Company company);
}
